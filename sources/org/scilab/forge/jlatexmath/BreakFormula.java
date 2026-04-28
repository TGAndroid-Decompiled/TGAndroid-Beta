package org.scilab.forge.jlatexmath;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public final class BreakFormula {
    public static Box split(Box box, float f, float f2) {
        if (box instanceof HorizontalBox) {
            return split((HorizontalBox) box, f, f2);
        }
        return box instanceof VerticalBox ? split((VerticalBox) box, f, f2) : box;
    }

    public static Box split(HorizontalBox horizontalBox, float f, float f2) {
        VerticalBox verticalBox = new VerticalBox();
        Stack stack = new Stack();
        Box box = null;
        HorizontalBox horizontalBox2 = horizontalBox;
        while (horizontalBox2.width > f && canBreak(stack, horizontalBox2, f) != horizontalBox2.width) {
            Position position = (Position) stack.pop();
            HorizontalBox[] horizontalBoxArrSplit = position.hbox.split(position.index - 1);
            HorizontalBox horizontalBox3 = horizontalBoxArrSplit[0];
            HorizontalBox horizontalBox4 = horizontalBoxArrSplit[1];
            while (!stack.isEmpty()) {
                Position position2 = (Position) stack.pop();
                HorizontalBox[] horizontalBoxArrSplitRemove = position2.hbox.splitRemove(position2.index);
                horizontalBoxArrSplitRemove[0].add(horizontalBox3);
                horizontalBoxArrSplitRemove[1].add(0, horizontalBox4);
                horizontalBox3 = horizontalBoxArrSplitRemove[0];
                horizontalBox4 = horizontalBoxArrSplitRemove[1];
            }
            verticalBox.add(horizontalBox3, f2);
            box = horizontalBox4;
            horizontalBox2 = horizontalBox4;
        }
        if (box == null) {
            return horizontalBox2;
        }
        verticalBox.add(box, f2);
        return verticalBox;
    }

    private static Box split(VerticalBox verticalBox, float f, float f2) {
        VerticalBox verticalBox2 = new VerticalBox();
        Iterator<Box> it = verticalBox.children.iterator();
        while (it.hasNext()) {
            verticalBox2.add(split(it.next(), f, f2));
        }
        return verticalBox2;
    }

    private static float canBreak(Stack<Position> stack, HorizontalBox horizontalBox, float f) {
        LinkedList<Box> linkedList = horizontalBox.children;
        float[] fArr = new float[linkedList.size() + 1];
        int i = 0;
        fArr[0] = 0.0f;
        while (i < linkedList.size()) {
            Box box = linkedList.get(i);
            int i2 = i + 1;
            float f2 = fArr[i] + box.width;
            fArr[i2] = f2;
            if (f2 > f) {
                int breakPosition = getBreakPosition(horizontalBox, i);
                if (box instanceof HorizontalBox) {
                    Stack stack2 = new Stack();
                    float fCanBreak = canBreak(stack2, (HorizontalBox) box, f - fArr[i]);
                    if (fCanBreak != box.width && (fArr[i] + fCanBreak <= f || breakPosition == -1)) {
                        stack.push(new Position(i - 1, horizontalBox));
                        stack.addAll(stack2);
                        return fArr[i] + fCanBreak;
                    }
                }
                if (breakPosition != -1) {
                    stack.push(new Position(breakPosition, horizontalBox));
                    return fArr[breakPosition];
                }
            }
            i = i2;
        }
        return horizontalBox.width;
    }

    private static int getBreakPosition(HorizontalBox horizontalBox, int i) {
        List<Integer> list = horizontalBox.breakPositions;
        if (list == null) {
            return -1;
        }
        int i2 = 0;
        if (list.size() == 1 && horizontalBox.breakPositions.get(0).intValue() <= i) {
            return horizontalBox.breakPositions.get(0).intValue();
        }
        while (i2 < horizontalBox.breakPositions.size()) {
            if (horizontalBox.breakPositions.get(i2).intValue() > i) {
                if (i2 == 0) {
                    return -1;
                }
                return horizontalBox.breakPositions.get(i2 - 1).intValue();
            }
            i2++;
        }
        return horizontalBox.breakPositions.get(i2 - 1).intValue();
    }

    private static class Position {
        HorizontalBox hbox;
        int index;

        Position(int i, HorizontalBox horizontalBox) {
            this.index = i;
            this.hbox = horizontalBox;
        }
    }
}
