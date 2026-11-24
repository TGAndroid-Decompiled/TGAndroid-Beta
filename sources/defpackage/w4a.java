package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class w4a implements Runnable {
    public final l3a E;
    public final long F;
    public final long G;
    public final long H;
    public final v67 I;
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
    public final k47 f;
    public final boolean h;
    public final k47 n;
    public final k47 r;
    public final boolean s;
    public final int w;
    public final TL_stories.StoryItem x;
    public final nv1 y;

    public w4a(int i, int i2, long j, long j2, long j3, long j4, j5 j5Var, nv1 nv1Var, k47 k47Var, k47 k47Var2, k47 k47Var3, v67 v67Var, l3a l3aVar, rcc rccVar, CharSequence charSequence, String str, String str2, ArrayList arrayList, TLRPC.Photo photo, TL_stories.StoryItem storyItem, boolean z, boolean z2, boolean z3) {
        this.K = rccVar;
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = j5Var;
        this.L = str2;
        this.M = photo;
        this.N = charSequence;
        this.f = k47Var;
        this.h = z;
        this.n = k47Var2;
        this.r = k47Var3;
        this.O = arrayList;
        this.s = z2;
        this.w = i2;
        this.x = storyItem;
        this.y = nv1Var;
        this.E = l3aVar;
        this.F = j2;
        this.G = j3;
        this.H = j4;
        this.I = v67Var;
        this.J = z3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w4a.run():void");
    }

    public w4a(k47 k47Var, TLRPC.TL_inputPollAnswer tL_inputPollAnswer, j5 j5Var, TLRPC.TL_document tL_document, String str, HashMap hashMap, z5a z5aVar, long j, k47 k47Var2, k47 k47Var3, boolean z, int i, int i2, TL_stories.StoryItem storyItem, nv1 nv1Var, l3a l3aVar, boolean z2, long j2, boolean z3, long j3, long j4, v67 v67Var, yg8 yg8Var) {
        this.f = k47Var;
        this.K = tL_inputPollAnswer;
        this.e = j5Var;
        this.L = tL_document;
        this.b = str;
        this.M = hashMap;
        this.N = z5aVar;
        this.c = j;
        this.n = k47Var2;
        this.r = k47Var3;
        this.h = z;
        this.d = i;
        this.w = i2;
        this.x = storyItem;
        this.y = nv1Var;
        this.E = l3aVar;
        this.s = z2;
        this.F = j2;
        this.J = z3;
        this.G = j3;
        this.H = j4;
        this.I = v67Var;
        this.O = yg8Var;
    }
}
