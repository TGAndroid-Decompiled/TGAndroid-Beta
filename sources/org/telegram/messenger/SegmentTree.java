package org.telegram.messenger;
public class SegmentTree {
    private long[] array;
    private Node[] heap;

    public static class Node {
        int from;
        long max;
        long min;
        Integer pendingVal = null;
        long sum;
        int to;

        public int size() {
            return (this.to - this.from) + 1;
        }
    }

    public SegmentTree(long[] jArr) {
        this.array = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.heap = new Node[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        build(1, 0, jArr.length);
    }

    private void build(int i9, int i10, int i11) {
        this.heap[i9] = new Node();
        Node node = this.heap[i9];
        node.from = i10;
        node.to = (i10 + i11) - 1;
        if (i11 == 1) {
            long j10 = this.array[i10];
            node.sum = j10;
            node.max = j10;
            node.min = j10;
            return;
        }
        int i12 = i9 * 2;
        int i13 = i11 / 2;
        build(i12, i10, i13);
        int i14 = i12 + 1;
        build(i14, i10 + i13, i11 - i13);
        Node[] nodeArr = this.heap;
        Node node2 = nodeArr[i9];
        Node node3 = nodeArr[i12];
        long j11 = node3.sum;
        Node node4 = nodeArr[i14];
        node2.sum = j11 + node4.sum;
        node2.max = Math.max(node3.max, node4.max);
        Node[] nodeArr2 = this.heap;
        nodeArr2[i9].min = Math.min(nodeArr2[i12].min, nodeArr2[i14].min);
    }

    private void change(Node node, int i9) {
        node.pendingVal = Integer.valueOf(i9);
        node.sum = node.size() * i9;
        long j10 = i9;
        node.max = j10;
        node.min = j10;
        this.array[node.from] = j10;
    }

    private boolean contains(int i9, int i10, int i11, int i12) {
        if (i11 >= i9 && i12 <= i10) {
            return true;
        }
        return false;
    }

    private boolean intersects(int i9, int i10, int i11, int i12) {
        if (i9 > i11 || i10 < i11) {
            if (i9 >= i11 && i9 <= i12) {
                return true;
            }
            return false;
        }
        return true;
    }

    private void propagate(int i9) {
        Node[] nodeArr = this.heap;
        Node node = nodeArr[i9];
        Integer num = node.pendingVal;
        if (num != null) {
            int i10 = i9 * 2;
            change(nodeArr[i10], num.intValue());
            change(this.heap[i10 + 1], node.pendingVal.intValue());
            node.pendingVal = null;
        }
    }

    public long rMaxQ(int i9, int i10) {
        long[] jArr = this.array;
        if (jArr.length < 30) {
            if (i9 < 0) {
                i9 = 0;
            }
            if (i10 > jArr.length - 1) {
                i10 = jArr.length - 1;
            }
            long j10 = Long.MIN_VALUE;
            while (i9 <= i10) {
                long j11 = this.array[i9];
                if (j11 > j10) {
                    j10 = j11;
                }
                i9++;
            }
            return j10;
        }
        return rMaxQ(1, i9, i10);
    }

    public long rMinQ(int i9, int i10) {
        long[] jArr = this.array;
        if (jArr.length < 30) {
            if (i9 < 0) {
                i9 = 0;
            }
            if (i10 > jArr.length - 1) {
                i10 = jArr.length - 1;
            }
            long j10 = Long.MAX_VALUE;
            while (i9 <= i10) {
                long j11 = this.array[i9];
                if (j11 < j10) {
                    j10 = j11;
                }
                i9++;
            }
            return j10;
        }
        return rMinQ(1, i9, i10);
    }

    private long rMaxQ(int i9, int i10, int i11) {
        Node node = this.heap[i9];
        if (node.pendingVal != null && contains(node.from, node.to, i10, i11)) {
            return node.pendingVal.intValue();
        }
        if (contains(i10, i11, node.from, node.to)) {
            return this.heap[i9].max;
        }
        if (intersects(i10, i11, node.from, node.to)) {
            propagate(i9);
            int i12 = i9 * 2;
            return Math.max(rMaxQ(i12, i10, i11), rMaxQ(i12 + 1, i10, i11));
        }
        return 0L;
    }

    private long rMinQ(int i9, int i10, int i11) {
        Node node = this.heap[i9];
        if (node.pendingVal != null && contains(node.from, node.to, i10, i11)) {
            return node.pendingVal.intValue();
        }
        if (contains(i10, i11, node.from, node.to)) {
            return this.heap[i9].min;
        }
        if (intersects(i10, i11, node.from, node.to)) {
            propagate(i9);
            int i12 = i9 * 2;
            return Math.min(rMinQ(i12, i10, i11), rMinQ(i12 + 1, i10, i11));
        }
        return 2147483647L;
    }
}
