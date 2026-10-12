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

    private void build(int i10, int i11, int i12) {
        this.heap[i10] = new Node();
        Node node = this.heap[i10];
        node.from = i11;
        node.to = (i11 + i12) - 1;
        if (i12 == 1) {
            long j10 = this.array[i11];
            node.sum = j10;
            node.max = j10;
            node.min = j10;
            return;
        }
        int i13 = i10 * 2;
        int i14 = i12 / 2;
        build(i13, i11, i14);
        int i15 = i13 + 1;
        build(i15, i11 + i14, i12 - i14);
        Node[] nodeArr = this.heap;
        Node node2 = nodeArr[i10];
        Node node3 = nodeArr[i13];
        long j11 = node3.sum;
        Node node4 = nodeArr[i15];
        node2.sum = j11 + node4.sum;
        node2.max = Math.max(node3.max, node4.max);
        Node[] nodeArr2 = this.heap;
        nodeArr2[i10].min = Math.min(nodeArr2[i13].min, nodeArr2[i15].min);
    }

    private void change(Node node, int i10) {
        node.pendingVal = Integer.valueOf(i10);
        node.sum = node.size() * i10;
        long j10 = i10;
        node.max = j10;
        node.min = j10;
        this.array[node.from] = j10;
    }

    private boolean contains(int i10, int i11, int i12, int i13) {
        if (i12 >= i10 && i13 <= i11) {
            return true;
        }
        return false;
    }

    private boolean intersects(int i10, int i11, int i12, int i13) {
        if (i10 > i12 || i11 < i12) {
            if (i10 >= i12 && i10 <= i13) {
                return true;
            }
            return false;
        }
        return true;
    }

    private void propagate(int i10) {
        Node[] nodeArr = this.heap;
        Node node = nodeArr[i10];
        Integer num = node.pendingVal;
        if (num != null) {
            int i11 = i10 * 2;
            change(nodeArr[i11], num.intValue());
            change(this.heap[i11 + 1], node.pendingVal.intValue());
            node.pendingVal = null;
        }
    }

    public long rMaxQ(int i10, int i11) {
        long[] jArr = this.array;
        if (jArr.length < 30) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 > jArr.length - 1) {
                i11 = jArr.length - 1;
            }
            long j10 = Long.MIN_VALUE;
            while (i10 <= i11) {
                long j11 = this.array[i10];
                if (j11 > j10) {
                    j10 = j11;
                }
                i10++;
            }
            return j10;
        }
        return rMaxQ(1, i10, i11);
    }

    public long rMinQ(int i10, int i11) {
        long[] jArr = this.array;
        if (jArr.length < 30) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 > jArr.length - 1) {
                i11 = jArr.length - 1;
            }
            long j10 = Long.MAX_VALUE;
            while (i10 <= i11) {
                long j11 = this.array[i10];
                if (j11 < j10) {
                    j10 = j11;
                }
                i10++;
            }
            return j10;
        }
        return rMinQ(1, i10, i11);
    }

    private long rMaxQ(int i10, int i11, int i12) {
        Node node = this.heap[i10];
        if (node.pendingVal != null && contains(node.from, node.to, i11, i12)) {
            return node.pendingVal.intValue();
        }
        if (contains(i11, i12, node.from, node.to)) {
            return this.heap[i10].max;
        }
        if (intersects(i11, i12, node.from, node.to)) {
            propagate(i10);
            int i13 = i10 * 2;
            return Math.max(rMaxQ(i13, i11, i12), rMaxQ(i13 + 1, i11, i12));
        }
        return 0L;
    }

    private long rMinQ(int i10, int i11, int i12) {
        Node node = this.heap[i10];
        if (node.pendingVal != null && contains(node.from, node.to, i11, i12)) {
            return node.pendingVal.intValue();
        }
        if (contains(i11, i12, node.from, node.to)) {
            return this.heap[i10].min;
        }
        if (intersects(i11, i12, node.from, node.to)) {
            propagate(i10);
            int i13 = i10 * 2;
            return Math.min(rMinQ(i13, i11, i12), rMinQ(i13 + 1, i11, i12));
        }
        return 2147483647L;
    }
}
