package org.scilab.forge.jlatexmath;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public final class BreakFormula {

    public static class Position {
        HorizontalBox hbox;
        int index;

        public Position(int i9, HorizontalBox horizontalBox) {
            this.index = i9;
            this.hbox = horizontalBox;
        }
    }

    private static float canBreak(Stack<Position> stack, HorizontalBox horizontalBox, float f10) {
        LinkedList<Box> linkedList = horizontalBox.children;
        float[] fArr = new float[linkedList.size() + 1];
        int i9 = 0;
        fArr[0] = 0.0f;
        while (i9 < linkedList.size()) {
            Box box = linkedList.get(i9);
            int i10 = i9 + 1;
            float f11 = fArr[i9] + box.width;
            fArr[i10] = f11;
            if (f11 > f10) {
                int breakPosition = getBreakPosition(horizontalBox, i9);
                if (box instanceof HorizontalBox) {
                    Stack stack2 = new Stack();
                    float canBreak = canBreak(stack2, (HorizontalBox) box, f10 - fArr[i9]);
                    if (canBreak != box.width && (fArr[i9] + canBreak <= f10 || breakPosition == -1)) {
                        stack.push(new Position(i9 - 1, horizontalBox));
                        stack.addAll(stack2);
                        return fArr[i9] + canBreak;
                    }
                }
                if (breakPosition != -1) {
                    stack.push(new Position(breakPosition, horizontalBox));
                    return fArr[breakPosition];
                }
            }
            i9 = i10;
        }
        return horizontalBox.width;
    }

    private static int getBreakPosition(HorizontalBox horizontalBox, int i9) {
        List<Integer> list = horizontalBox.breakPositions;
        if (list == null) {
            return -1;
        }
        int i10 = 0;
        if (list.size() == 1 && horizontalBox.breakPositions.get(0).intValue() <= i9) {
            return horizontalBox.breakPositions.get(0).intValue();
        }
        while (i10 < horizontalBox.breakPositions.size()) {
            if (horizontalBox.breakPositions.get(i10).intValue() > i9) {
                if (i10 == 0) {
                    return -1;
                }
                return horizontalBox.breakPositions.get(i10 - 1).intValue();
            }
            i10++;
        }
        return horizontalBox.breakPositions.get(i10 - 1).intValue();
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
        HorizontalBox horizontalBox2 = null;
        while (horizontalBox.width > f10 && canBreak(stack, horizontalBox, f10) != horizontalBox.width) {
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
            verticalBox.add(horizontalBox3, f11);
            horizontalBox2 = horizontalBox;
        }
        if (horizontalBox2 != null) {
            verticalBox.add(horizontalBox2, f11);
            return verticalBox;
        }
        return horizontalBox;
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
