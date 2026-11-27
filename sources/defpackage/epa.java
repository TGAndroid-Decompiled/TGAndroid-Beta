package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
public final class epa extends cpa {
    public final long a;
    public final long b;
    public final List c;

    public epa(long j, long j2, List list) {
        this.a = j;
        this.b = j2;
        this.c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.a);
        sb.append(", programSplicePlaybackPositionUs= ");
        return qu6.p(sb, this.b, " }");
    }
}
