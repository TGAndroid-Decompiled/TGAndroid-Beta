package org.scilab.forge.jlatexmath;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;
public class HorizontalBox extends Box {
    protected List<Integer> breakPositions;
    private float curPos;

    public HorizontalBox(Box box, float f, int i) {
        this.curPos = 0.0f;
        if (f != Float.POSITIVE_INFINITY) {
            float width = f - box.getWidth();
            if (width > 0.0f) {
                if (i != 2 && i != 5) {
                    if (i == 0) {
                        add(box);
                        add(new StrutBox(width, 0.0f, 0.0f, 0.0f));
                        return;
                    } else if (i == 1) {
                        add(new StrutBox(width, 0.0f, 0.0f, 0.0f));
                        add(box);
                        return;
                    } else {
                        add(box);
                        return;
                    }
                }
                StrutBox strutBox = new StrutBox(width / 2.0f, 0.0f, 0.0f, 0.0f);
                add(strutBox);
                add(box);
                add(strutBox);
                return;
            }
            add(box);
            return;
        }
        add(box);
    }

    private void recalculate(Box box) {
        float f;
        this.width = box.getWidth() + this.width;
        float f2 = Float.NEGATIVE_INFINITY;
        if (this.children.size() == 0) {
            f = Float.NEGATIVE_INFINITY;
        } else {
            f = this.height;
        }
        this.height = Math.max(f, box.height - box.shift);
        if (this.children.size() != 0) {
            f2 = this.depth;
        }
        this.depth = Math.max(f2, box.depth + box.shift);
    }

    private HorizontalBox[] split(int i, int i2) {
        HorizontalBox cloneBox = cloneBox();
        HorizontalBox cloneBox2 = cloneBox();
        for (int i3 = 0; i3 <= i; i3++) {
            cloneBox.add(this.children.get(i3));
        }
        for (int i4 = i2 + i; i4 < this.children.size(); i4++) {
            cloneBox2.add(this.children.get(i4));
        }
        if (this.breakPositions != null) {
            for (int i5 = 0; i5 < this.breakPositions.size(); i5++) {
                if (this.breakPositions.get(i5).intValue() > i + 1) {
                    cloneBox2.addBreakPosition((this.breakPositions.get(i5).intValue() - i) - 1);
                }
            }
        }
        return new HorizontalBox[]{cloneBox, cloneBox2};
    }

    @Override
    public final void add(Box box) {
        recalculate(box);
        super.add(box);
    }

    public void addBreakPosition(int i) {
        if (this.breakPositions == null) {
            this.breakPositions = new ArrayList();
        }
        this.breakPositions.add(Integer.valueOf(i));
    }

    public HorizontalBox cloneBox() {
        HorizontalBox horizontalBox = new HorizontalBox(this.foreground, this.background);
        horizontalBox.shift = this.shift;
        return horizontalBox;
    }

    @Override
    public void draw(Graphics2D graphics2D, float f, float f2) {
        startDraw(graphics2D, f, f2);
        Iterator<Box> it = this.children.iterator();
        while (it.hasNext()) {
            Box next = it.next();
            next.draw(graphics2D, f, next.shift + f2);
            f += next.getWidth();
        }
        endDraw(graphics2D);
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

    public HorizontalBox[] splitRemove(int i) {
        return split(i, 2);
    }

    @Override
    public final void add(int i, Box box) {
        recalculate(box);
        super.add(i, box);
    }

    public HorizontalBox(Box box) {
        this.curPos = 0.0f;
        add(box);
    }

    public HorizontalBox() {
        this.curPos = 0.0f;
    }

    public HorizontalBox(Color color, Color color2) {
        super(color, color2);
        this.curPos = 0.0f;
    }

    public HorizontalBox[] split(int i) {
        return split(i, 1);
    }
}
