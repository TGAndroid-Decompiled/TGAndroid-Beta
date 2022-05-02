package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

public class SegmentTree {
    private int[] array;
    private Node[] heap;

    private boolean contains(int i, int i2, int i3, int i4) {
        return i3 >= i && i4 <= i2;
    }

    private boolean intersects(int i, int i2, int i3, int i4) {
        return (i <= i3 && i2 >= i3) || (i >= i3 && i <= i4);
    }

    public SegmentTree(int[] iArr) {
        this.array = iArr;
        if (iArr.length >= 30) {
            this.heap = new Node[(int) (Math.pow(2.0d, Math.floor((Math.log(iArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
            build(1, 0, iArr.length);
        }
    }

    private void build(int i, int i2, int i3) {
        this.heap[i] = new Node();
        Node[] nodeArr = this.heap;
        nodeArr[i].from = i2;
        nodeArr[i].f812to = (i2 + i3) - 1;
        if (i3 == 1) {
            Node node = nodeArr[i];
            int[] iArr = this.array;
            node.sum = iArr[i2];
            nodeArr[i].max = iArr[i2];
            nodeArr[i].min = iArr[i2];
            return;
        }
        int i4 = i * 2;
        int i5 = i3 / 2;
        build(i4, i2, i5);
        int i6 = i4 + 1;
        build(i6, i2 + i5, i3 - i5);
        Node[] nodeArr2 = this.heap;
        nodeArr2[i].sum = nodeArr2[i4].sum + nodeArr2[i6].sum;
        nodeArr2[i].max = Math.max(nodeArr2[i4].max, nodeArr2[i6].max);
        Node[] nodeArr3 = this.heap;
        nodeArr3[i].min = Math.min(nodeArr3[i4].min, nodeArr3[i6].min);
    }

    public int rMaxQ(int i, int i2) {
        int[] iArr = this.array;
        if (iArr.length >= 30) {
            return rMaxQ(1, i, i2);
        }
        int i3 = Integer.MIN_VALUE;
        if (i < 0) {
            i = 0;
        }
        if (i2 > iArr.length - 1) {
            i2 = iArr.length - 1;
        }
        while (i <= i2) {
            int[] iArr2 = this.array;
            if (iArr2[i] > i3) {
                i3 = iArr2[i];
            }
            i++;
        }
        return i3;
    }

    private int rMaxQ(int i, int i2, int i3) {
        Node node = this.heap[i];
        if (node.pendingVal != null && contains(node.from, node.f812to, i2, i3)) {
            return node.pendingVal.intValue();
        }
        if (contains(i2, i3, node.from, node.f812to)) {
            return this.heap[i].max;
        }
        if (!intersects(i2, i3, node.from, node.f812to)) {
            return 0;
        }
        propagate(i);
        int i4 = i * 2;
        return Math.max(rMaxQ(i4, i2, i3), rMaxQ(i4 + 1, i2, i3));
    }

    public int rMinQ(int i, int i2) {
        int[] iArr = this.array;
        if (iArr.length >= 30) {
            return rMinQ(1, i, i2);
        }
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i < 0) {
            i = 0;
        }
        if (i2 > iArr.length - 1) {
            i2 = iArr.length - 1;
        }
        while (i <= i2) {
            int[] iArr2 = this.array;
            if (iArr2[i] < i3) {
                i3 = iArr2[i];
            }
            i++;
        }
        return i3;
    }

    private int rMinQ(int i, int i2, int i3) {
        Node node = this.heap[i];
        if (node.pendingVal != null && contains(node.from, node.f812to, i2, i3)) {
            return node.pendingVal.intValue();
        }
        if (contains(i2, i3, node.from, node.f812to)) {
            return this.heap[i].min;
        }
        if (!intersects(i2, i3, node.from, node.f812to)) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        propagate(i);
        int i4 = i * 2;
        return Math.min(rMinQ(i4, i2, i3), rMinQ(i4 + 1, i2, i3));
    }

    private void propagate(int i) {
        Node[] nodeArr = this.heap;
        Node node = nodeArr[i];
        Integer num = node.pendingVal;
        if (num != null) {
            int i2 = i * 2;
            change(nodeArr[i2], num.intValue());
            change(this.heap[i2 + 1], node.pendingVal.intValue());
            node.pendingVal = null;
        }
    }

    private void change(Node node, int i) {
        node.pendingVal = Integer.valueOf(i);
        node.sum = node.size() * i;
        node.max = i;
        node.min = i;
        this.array[node.from] = i;
    }

    public static class Node {
        int from;
        int max;
        int min;
        Integer pendingVal = null;
        int sum;
        int f812to;

        Node() {
        }

        int size() {
            return (this.f812to - this.from) + 1;
        }
    }
}
