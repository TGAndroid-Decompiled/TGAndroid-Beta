package org.scilab.forge.jlatexmath;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public final class BreakFormula {

    public static class Position {
        HorizontalBox hbox;
        int index;

        public Position(int i, HorizontalBox horizontalBox) {
            this.index = i;
            this.hbox = horizontalBox;
        }
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
                    float canBreak = canBreak(stack2, (HorizontalBox) box, f - fArr[i]);
                    if (canBreak != box.width && (fArr[i] + canBreak <= f || breakPosition == -1)) {
                        stack.push(new Position(i - 1, horizontalBox));
                        stack.addAll(stack2);
                        return fArr[i] + canBreak;
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
        while (true) {
            int size = horizontalBox.breakPositions.size();
            List<Integer> list2 = horizontalBox.breakPositions;
            if (i2 < size) {
                if (list2.get(i2).intValue() > i) {
                    if (i2 == 0) {
                        return -1;
                    }
                    return horizontalBox.breakPositions.get(i2 - 1).intValue();
                }
                i2++;
            } else {
                return list2.get(i2 - 1).intValue();
            }
        }
    }

    public static Box split(HorizontalBox horizontalBox, float f, float f2) {
        VerticalBox verticalBox = new VerticalBox();
        Stack stack = new Stack();
        HorizontalBox horizontalBox2 = null;
        while (horizontalBox.width > f && canBreak(stack, horizontalBox, f) != horizontalBox.width) {
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
            verticalBox.add(horizontalBox3, f2);
            horizontalBox2 = horizontalBox;
        }
        if (horizontalBox2 != null) {
            verticalBox.add(horizontalBox2, f2);
            return verticalBox;
        }
        return horizontalBox;
    }

    public static Box split(Box box, float f, float f2) {
        if (box instanceof HorizontalBox) {
            return split((HorizontalBox) box, f, f2);
        }
        return box instanceof VerticalBox ? split((VerticalBox) box, f, f2) : box;
    }

    private static Box split(VerticalBox verticalBox, float f, float f2) {
        VerticalBox verticalBox2 = new VerticalBox();
        Iterator<Box> it = verticalBox.children.iterator();
        while (it.hasNext()) {
            verticalBox2.add(split(it.next(), f, f2));
        }
        return verticalBox2;
    }
}
