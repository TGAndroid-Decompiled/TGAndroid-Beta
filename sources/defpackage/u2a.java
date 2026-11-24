package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class u2a implements Runnable {
    public final j1a E;
    public final long F;
    public final long G;
    public final long H;
    public final u47 I;
    public final boolean J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final byte a = 1;
    public final String b;
    public final long c;
    public final int d;
    public final j5 e;
    public final k27 f;
    public final boolean h;
    public final k27 n;
    public final k27 r;
    public final boolean s;
    public final int w;
    public final TL_stories.StoryItem x;
    public final bu1 y;

    public u2a(int i, int i2, long j, long j2, long j3, long j4, j5 j5Var, bu1 bu1Var, k27 k27Var, k27 k27Var2, k27 k27Var3, u47 u47Var, j1a j1aVar, oac oacVar, CharSequence charSequence, String str, String str2, ArrayList arrayList, TLRPC.Photo photo, TL_stories.StoryItem storyItem, boolean z, boolean z2, boolean z3) {
        this.K = oacVar;
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = j5Var;
        this.L = str2;
        this.M = photo;
        this.N = charSequence;
        this.f = k27Var;
        this.h = z;
        this.n = k27Var2;
        this.r = k27Var3;
        this.O = arrayList;
        this.s = z2;
        this.w = i2;
        this.x = storyItem;
        this.y = bu1Var;
        this.E = j1aVar;
        this.F = j2;
        this.G = j3;
        this.H = j4;
        this.I = u47Var;
        this.J = z3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u2a.run():void");
    }

    public u2a(k27 k27Var, TLRPC.TL_inputPollAnswer tL_inputPollAnswer, j5 j5Var, TLRPC.TL_document tL_document, String str, HashMap hashMap, y3a y3aVar, long j, k27 k27Var2, k27 k27Var3, boolean z, int i, int i2, TL_stories.StoryItem storyItem, bu1 bu1Var, j1a j1aVar, boolean z2, long j2, boolean z3, long j3, long j4, u47 u47Var, we8 we8Var) {
        this.f = k27Var;
        this.K = tL_inputPollAnswer;
        this.e = j5Var;
        this.L = tL_document;
        this.b = str;
        this.M = hashMap;
        this.N = y3aVar;
        this.c = j;
        this.n = k27Var2;
        this.r = k27Var3;
        this.h = z;
        this.d = i;
        this.w = i2;
        this.x = storyItem;
        this.y = bu1Var;
        this.E = j1aVar;
        this.s = z2;
        this.F = j2;
        this.J = z3;
        this.G = j3;
        this.H = j4;
        this.I = u47Var;
        this.O = we8Var;
    }
}
