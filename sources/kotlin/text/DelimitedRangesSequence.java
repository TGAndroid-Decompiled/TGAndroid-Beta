package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;

final class DelimitedRangesSequence implements Sequence {
    private final Function2 getNextMatch;
    private final CharSequence input;
    private final int limit;
    private final int startIndex;

    public DelimitedRangesSequence(CharSequence input, int i, int i2, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.input = input;
        this.startIndex = i;
        this.limit = i2;
        this.getNextMatch = getNextMatch;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int counter;
            private int currentStartIndex;
            private IntRange nextItem;
            private int nextSearchIndex;
            private int nextState = -1;

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            {
                int iCoerceIn = RangesKt.coerceIn(DelimitedRangesSequence.this.startIndex, 0, DelimitedRangesSequence.this.input.length());
                this.currentStartIndex = iCoerceIn;
                this.nextSearchIndex = iCoerceIn;
            }

            private final void calcNext() {
                Pair pair;
                if (this.nextSearchIndex >= 0) {
                    if (DelimitedRangesSequence.this.limit > 0) {
                        int i = this.counter + 1;
                        this.counter = i;
                        if (i < DelimitedRangesSequence.this.limit) {
                            if (this.nextSearchIndex <= DelimitedRangesSequence.this.input.length() || (pair = (Pair) DelimitedRangesSequence.this.getNextMatch.invoke(DelimitedRangesSequence.this.input, Integer.valueOf(this.nextSearchIndex))) == null) {
                                this.nextItem = new IntRange(this.currentStartIndex, StringsKt__StringsKt.getLastIndex(DelimitedRangesSequence.this.input));
                                this.nextSearchIndex = -1;
                            } else {
                                int iIntValue = ((Number) pair.component1()).intValue();
                                int iIntValue2 = ((Number) pair.component2()).intValue();
                                this.nextItem = RangesKt.until(this.currentStartIndex, iIntValue);
                                int i2 = iIntValue + iIntValue2;
                                this.currentStartIndex = i2;
                                this.nextSearchIndex = i2 + (iIntValue2 == 0 ? 1 : 0);
                            }
                        } else {
                            this.nextItem = new IntRange(this.currentStartIndex, StringsKt__StringsKt.getLastIndex(DelimitedRangesSequence.this.input));
                            this.nextSearchIndex = -1;
                        }
                    } else if (this.nextSearchIndex <= DelimitedRangesSequence.this.input.length()) {
                        this.nextItem = new IntRange(this.currentStartIndex, StringsKt__StringsKt.getLastIndex(DelimitedRangesSequence.this.input));
                        this.nextSearchIndex = -1;
                    } else {
                        int iIntValue3 = ((Number) pair.component1()).intValue();
                        int iIntValue4 = ((Number) pair.component2()).intValue();
                        this.nextItem = RangesKt.until(this.currentStartIndex, iIntValue3);
                        int i3 = iIntValue3 + iIntValue4;
                        this.currentStartIndex = i3;
                        this.nextSearchIndex = i3 + (iIntValue4 == 0 ? 1 : 0);
                    }
                    this.nextState = 1;
                    return;
                }
                this.nextState = 0;
                this.nextItem = null;
            }

            @Override
            public IntRange next() {
                if (this.nextState == -1) {
                    calcNext();
                }
                if (this.nextState == 0) {
                    throw new NoSuchElementException();
                }
                IntRange intRange = this.nextItem;
                Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.nextItem = null;
                this.nextState = -1;
                return intRange;
            }

            @Override
            public boolean hasNext() {
                if (this.nextState == -1) {
                    calcNext();
                }
                return this.nextState == 1;
            }
        };
    }
}
