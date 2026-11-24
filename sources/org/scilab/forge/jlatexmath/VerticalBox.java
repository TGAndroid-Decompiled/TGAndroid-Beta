package org.scilab.forge.jlatexmath;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import ru.noties.jlatexmath.awt.Graphics2D;
public class VerticalBox extends Box {
    private float leftMostPos;
    private float rightMostPos;

    public VerticalBox(Box box, float f, int i) {
        this();
        add(box);
        if (i == 2) {
            float f2 = f / 2.0f;
            StrutBox strutBox = new StrutBox(0.0f, f2, 0.0f, 0.0f);
            super.add(0, strutBox);
            this.height += f2;
            this.depth += f2;
            super.add(strutBox);
        } else if (i == 3) {
            this.depth += f;
            super.add(new StrutBox(0.0f, f, 0.0f, 0.0f));
        } else if (i == 4) {
            this.height += f;
            super.add(0, new StrutBox(0.0f, f, 0.0f, 0.0f));
        }
    }

    private void recalculateWidth(Box box) {
        this.leftMostPos = Math.min(this.leftMostPos, box.shift);
        float f = this.rightMostPos;
        float f2 = box.shift;
        float f3 = box.width;
        if (f3 <= 0.0f) {
            f3 = 0.0f;
        }
        float max = Math.max(f, f2 + f3);
        this.rightMostPos = max;
        this.width = max - this.leftMostPos;
    }

    @Override
    public final void add(Box box) {
        super.add(box);
        if (this.children.size() == 1) {
            this.height = box.height;
            this.depth = box.depth;
        } else {
            this.depth = box.height + box.depth + this.depth;
        }
        recalculateWidth(box);
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        float f3 = f2 - this.height;
        Iterator<Box> it = this.children.iterator();
        while (it.hasNext()) {
            Box next = it.next();
            float height = next.getHeight() + f3;
            next.draw(graphics2D, (next.getShift() + f) - this.leftMostPos, height);
            f3 = next.getDepth() + height;
        }
    }

    @Override
    public int getLastFontId() {
        LinkedList<Box> linkedList = this.children;
        ListIterator<Box> listIterator = linkedList.listIterator(linkedList.size());
        int i = -1;
        while (i == -1 && listIterator.hasPrevious()) {
            i = listIterator.previous().getLastFontId();
        }
        return i;
    }

    public int getSize() {
        return this.children.size();
    }

    public final void add(Box box, float f) {
        if (this.children.size() >= 1) {
            add(new StrutBox(0.0f, f, 0.0f, 0.0f));
        }
        add(box);
    }

    @Override
    public void add(int i, Box box) {
        super.add(i, box);
        float f = this.depth;
        if (i == 0) {
            this.depth = box.depth + this.height + f;
            this.height = box.height;
        } else {
            this.depth = box.height + box.depth + f;
        }
        recalculateWidth(box);
    }

    public VerticalBox() {
        this.leftMostPos = Float.MAX_VALUE;
        this.rightMostPos = -3.4028235E38f;
    }
}
