package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class g6a implements Runnable {
    public final c5a E;
    public final long F;
    public final long G;
    public final long H;
    public final b77 I;
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
    public final k5 e;
    public final r47 f;
    public final boolean h;
    public final r47 n;
    public final r47 r;
    public final boolean s;
    public final int w;
    public final TL_stories.StoryItem x;
    public final ou1 y;

    public g6a(int i, int i2, long j, long j2, long j3, long j4, k5 k5Var, ou1 ou1Var, r47 r47Var, r47 r47Var2, r47 r47Var3, b77 b77Var, c5a c5aVar, oec oecVar, CharSequence charSequence, String str, String str2, ArrayList arrayList, TLRPC.Photo photo, TL_stories.StoryItem storyItem, boolean z, boolean z2, boolean z3) {
        this.K = oecVar;
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = k5Var;
        this.L = str2;
        this.M = photo;
        this.N = charSequence;
        this.f = r47Var;
        this.h = z;
        this.n = r47Var2;
        this.r = r47Var3;
        this.O = arrayList;
        this.s = z2;
        this.w = i2;
        this.x = storyItem;
        this.y = ou1Var;
        this.E = c5aVar;
        this.F = j2;
        this.G = j3;
        this.H = j4;
        this.I = b77Var;
        this.J = z3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6a.run():void");
    }

    public g6a(r47 r47Var, TLRPC.TL_inputPollAnswer tL_inputPollAnswer, k5 k5Var, TLRPC.TL_document tL_document, String str, HashMap hashMap, q7a q7aVar, long j, r47 r47Var2, r47 r47Var3, boolean z, int i, int i2, TL_stories.StoryItem storyItem, ou1 ou1Var, c5a c5aVar, boolean z2, long j2, boolean z3, long j3, long j4, b77 b77Var, ki8 ki8Var) {
        this.f = r47Var;
        this.K = tL_inputPollAnswer;
        this.e = k5Var;
        this.L = tL_document;
        this.b = str;
        this.M = hashMap;
        this.N = q7aVar;
        this.c = j;
        this.n = r47Var2;
        this.r = r47Var3;
        this.h = z;
        this.d = i;
        this.w = i2;
        this.x = storyItem;
        this.y = ou1Var;
        this.E = c5aVar;
        this.s = z2;
        this.F = j2;
        this.J = z3;
        this.G = j3;
        this.H = j4;
        this.I = b77Var;
        this.O = ki8Var;
    }
}
