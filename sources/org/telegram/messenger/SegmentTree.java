package org.telegram.messenger;
public class SegmentTree {
    private long[] array;
    private Node[] heap;

    private boolean contains(int i, int i2, int i3, int i4) {
        return i3 >= i && i4 <= i2;
    }

    private boolean intersects(int i, int i2, int i3, int i4) {
        return (i <= i3 && i2 >= i3) || (i >= i3 && i <= i4);
    }

    public SegmentTree(long[] jArr) {
        this.array = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.heap = new Node[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        build(1, 0, jArr.length);
    }

    private void build(int i, int i2, int i3) {
        this.heap[i] = new Node();
        Node node = this.heap[i];
        node.from = i2;
        node.to = (i2 + i3) - 1;
        if (i3 == 1) {
            long j = this.array[i2];
            node.sum = j;
            node.max = j;
            node.min = j;
            return;
        }
        int i4 = i * 2;
        int i5 = i3 / 2;
        build(i4, i2, i5);
        int i6 = i4 + 1;
        build(i6, i2 + i5, i3 - i5);
        Node[] nodeArr = this.heap;
        Node node2 = nodeArr[i];
        Node node3 = nodeArr[i4];
        long j2 = node3.sum;
        Node node4 = nodeArr[i6];
        node2.sum = j2 + node4.sum;
        node2.max = Math.max(node3.max, node4.max);
        Node[] nodeArr2 = this.heap;
        nodeArr2[i].min = Math.min(nodeArr2[i4].min, nodeArr2[i6].min);
    }

    public long rMaxQ(int i, int i2) {
        long[] jArr = this.array;
        if (jArr.length < 30) {
            if (i < 0) {
                i = 0;
            }
            if (i2 > jArr.length - 1) {
                i2 = jArr.length - 1;
            }
            long j = Long.MIN_VALUE;
            while (i <= i2) {
                long j2 = this.array[i];
                if (j2 > j) {
                    j = j2;
                }
                i++;
            }
            return j;
        }
        return rMaxQ(1, i, i2);
    }

    private long rMaxQ(int i, int i2, int i3) {
        Node node = this.heap[i];
        if (node.pendingVal != null && contains(node.from, node.to, i2, i3)) {
            return node.pendingVal.intValue();
        }
        if (contains(i2, i3, node.from, node.to)) {
            return this.heap[i].max;
        }
        if (intersects(i2, i3, node.from, node.to)) {
            propagate(i);
            int i4 = i * 2;
            return Math.max(rMaxQ(i4, i2, i3), rMaxQ(i4 + 1, i2, i3));
        }
        return 0L;
    }

    public long rMinQ(int i, int i2) {
        long[] jArr = this.array;
        if (jArr.length < 30) {
            if (i < 0) {
                i = 0;
            }
            if (i2 > jArr.length - 1) {
                i2 = jArr.length - 1;
            }
            long j = Long.MAX_VALUE;
            while (i <= i2) {
                long j2 = this.array[i];
                if (j2 < j) {
                    j = j2;
                }
                i++;
            }
            return j;
        }
        return rMinQ(1, i, i2);
    }

    private long rMinQ(int i, int i2, int i3) {
        Node node = this.heap[i];
        if (node.pendingVal != null && contains(node.from, node.to, i2, i3)) {
            return node.pendingVal.intValue();
        }
        if (contains(i2, i3, node.from, node.to)) {
            return this.heap[i].min;
        }
        if (intersects(i2, i3, node.from, node.to)) {
            propagate(i);
            int i4 = i * 2;
            return Math.min(rMinQ(i4, i2, i3), rMinQ(i4 + 1, i2, i3));
        }
        return 2147483647L;
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
        long j = i;
        node.max = j;
        node.min = j;
        this.array[node.from] = j;
    }

    public static class Node {
        int from;
        long max;
        long min;
        Integer pendingVal = null;
        long sum;
        int to;

        Node() {
        }

        int size() {
            return (this.to - this.from) + 1;
        }
    }
}
