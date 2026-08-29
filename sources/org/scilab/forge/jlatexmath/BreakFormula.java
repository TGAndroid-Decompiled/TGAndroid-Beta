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

    private static float canBreak(Stack<Position> stack, HorizontalBox horizontalBox, float f9) {
        LinkedList<Box> linkedList = horizontalBox.children;
        float[] fArr = new float[linkedList.size() + 1];
        int i10 = 0;
        fArr[0] = 0.0f;
        while (i10 < linkedList.size()) {
            Box box = linkedList.get(i10);
            int i11 = i10 + 1;
            float f10 = fArr[i10] + box.width;
            fArr[i11] = f10;
            if (f10 > f9) {
                int breakPosition = getBreakPosition(horizontalBox, i10);
                if (box instanceof HorizontalBox) {
                    Stack stack2 = new Stack();
                    float canBreak = canBreak(stack2, (HorizontalBox) box, f9 - fArr[i10]);
                    if (canBreak != box.width && (fArr[i10] + canBreak <= f9 || breakPosition == -1)) {
                        stack.push(new Position(i10 - 1, horizontalBox));
                        stack.addAll(stack2);
                        return fArr[i10] + canBreak;
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

    public static Box split(Box box, float f9, float f10) {
        if (box instanceof HorizontalBox) {
            return split((HorizontalBox) box, f9, f10);
        }
        return box instanceof VerticalBox ? split((VerticalBox) box, f9, f10) : box;
    }

    public static Box split(HorizontalBox horizontalBox, float f9, float f10) {
        VerticalBox verticalBox = new VerticalBox();
        Stack stack = new Stack();
        HorizontalBox horizontalBox2 = null;
        while (horizontalBox.width > f9 && canBreak(stack, horizontalBox, f9) != horizontalBox.width) {
            Position position = (Position) stack.pop();
            HorizontalBox[] split = position.hbox.split(position.index - 1);
            HorizontalBox horizontalBox3 = split[0];
            horizontalBox = split[1];
            while (!stack.isEmpty()) {
                Position position2 = (Position) stack.pop();
                HorizontalBox[] splitRemove = position2.hbox.splitRemove(position2.index);
                splitRemove[0].add(horizontalBox3);
                splitRemove[1].add(0, horizontalBox);
                horizontalBox3 = splitRemove[0];
                horizontalBox = splitRemove[1];
            }
            verticalBox.add(horizontalBox3, f10);
            horizontalBox2 = horizontalBox;
        }
        if (horizontalBox2 != null) {
            verticalBox.add(horizontalBox2, f10);
            return verticalBox;
        }
        return horizontalBox;
    }

    private static Box split(VerticalBox verticalBox, float f9, float f10) {
        VerticalBox verticalBox2 = new VerticalBox();
        Iterator<Box> it = verticalBox.children.iterator();
        while (it.hasNext()) {
            verticalBox2.add(split(it.next(), f9, f10));
        }
        return verticalBox2;
    }
}
