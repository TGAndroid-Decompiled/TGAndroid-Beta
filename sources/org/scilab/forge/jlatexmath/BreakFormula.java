package org.scilab.forge.jlatexmath;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public final class BreakFormula {

    public static class Position {
        HorizontalBox hbox;
        int index;

        public Position(int i10, HorizontalBox horizontalBox) {
            this.index = i10;
            this.hbox = horizontalBox;
        }
    }

    private static float canBreak(Stack<Position> stack, HorizontalBox horizontalBox, float f10) {
        LinkedList<Box> linkedList = horizontalBox.children;
        float[] fArr = new float[linkedList.size() + 1];
        int i10 = 0;
        fArr[0] = 0.0f;
        while (i10 < linkedList.size()) {
            Box box = linkedList.get(i10);
            int i11 = i10 + 1;
            float f11 = fArr[i10] + box.width;
            fArr[i11] = f11;
            if (f11 > f10) {
                int breakPosition = getBreakPosition(horizontalBox, i10);
                if (box instanceof HorizontalBox) {
                    Stack stack2 = new Stack();
                    float fCanBreak = canBreak(stack2, (HorizontalBox) box, f10 - fArr[i10]);
                    if (fCanBreak != box.width && (fArr[i10] + fCanBreak <= f10 || breakPosition == -1)) {
                        stack.push(new Position(i10 - 1, horizontalBox));
                        stack.addAll(stack2);
                        return fArr[i10] + fCanBreak;
                    }
                }
                if (breakPosition != -1) {
                    stack.push(new Position(breakPosition, horizontalBox));
                    return fArr[breakPosition];
                }
            }
            i10 = i11;
        }
        return horizontalBox.width;
    }

    private static int getBreakPosition(HorizontalBox horizontalBox, int i10) {
        List<Integer> list = horizontalBox.breakPositions;
        if (list == null) {
            return -1;
        }
        int i11 = 0;
        if (list.size() == 1 && horizontalBox.breakPositions.get(0).intValue() <= i10) {
            return horizontalBox.breakPositions.get(0).intValue();
        }
        while (i11 < horizontalBox.breakPositions.size()) {
            if (horizontalBox.breakPositions.get(i11).intValue() > i10) {
                if (i11 == 0) {
                    return -1;
                }
                return horizontalBox.breakPositions.get(i11 - 1).intValue();
            }
            i11++;
        }
        return horizontalBox.breakPositions.get(i11 - 1).intValue();
    }

    public static Box split(Box box, float f10, float f11) {
        if (box instanceof HorizontalBox) {
            return split((HorizontalBox) box, f10, f11);
        }
        return box instanceof VerticalBox ? split((VerticalBox) box, f10, f11) : box;
    }

    public static Box split(HorizontalBox horizontalBox, float f10, float f11) {
        VerticalBox verticalBox = new VerticalBox();
        Stack stack = new Stack();
        Box box = null;
        HorizontalBox horizontalBox2 = horizontalBox;
        while (horizontalBox2.width > f10 && canBreak(stack, horizontalBox2, f10) != horizontalBox2.width) {
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
            verticalBox.add(horizontalBox3, f11);
            box = horizontalBox4;
            horizontalBox2 = horizontalBox4;
        }
        if (box == null) {
            return horizontalBox2;
        }
        verticalBox.add(box, f11);
        return verticalBox;
    }

    private static Box split(VerticalBox verticalBox, float f10, float f11) {
        VerticalBox verticalBox2 = new VerticalBox();
        Iterator<Box> it = verticalBox.children.iterator();
        while (it.hasNext()) {
            verticalBox2.add(split(it.next(), f10, f11));
        }
        return verticalBox2;
    }
}
