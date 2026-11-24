package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class y5a {
    public int A;
    public int B;
    public int C;
    public Object D;
    public g47 E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public nv1 J;
    public l3a K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public v67 T;
    public boolean U;
    public long V;
    public long W;
    public long X;
    public TL_iv.RichMessage Y;
    public ArrayList Z;
    public String a;
    public String b;
    public TLRPC.MessageMedia c;
    public TLRPC.TL_photo d;
    public rcc e;
    public TLRPC.User f;
    public TLRPC.TL_document g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll i;
    public yg8 j;
    public int k;
    public TLRPC.TL_messageMediaToDo l;
    public TLRPC.TL_messageMediaInvoice m;
    public TLRPC.TL_messageMediaWebPage n;
    public TLRPC.PhotoSize o;
    public long p;
    public String q;
    public k47 r;
    public k47 s;
    public TLRPC.WebPage t;
    public boolean u;
    public k47 v;
    public ArrayList w;
    public TLRPC.ReplyMarkup x;
    public HashMap y;
    public boolean z;

    public static y5a a(long j, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static y5a b(String str, long j, k47 k47Var, k47 k47Var2, TLRPC.WebPage webPage, boolean z, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z2, int i, int i2, g47 g47Var, boolean z3) {
        return c(str, null, null, null, null, null, null, null, null, null, j, null, k47Var, k47Var2, webPage, z, null, arrayList, replyMarkup, hashMap, z2, i, i2, 0, null, g47Var, z3, false);
    }

    public static y5a c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, rcc rccVar, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j, String str3, k47 k47Var, k47 k47Var2, TLRPC.WebPage webPage, boolean z, k47 k47Var3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z2, int i, int i2, int i3, Object obj, g47 g47Var, boolean z3, boolean z4) {
        ?? obj2 = new Object();
        obj2.a = str;
        obj2.b = str2;
        obj2.c = messageMedia;
        obj2.d = tL_photo;
        obj2.e = rccVar;
        obj2.f = user;
        obj2.g = tL_document;
        obj2.h = tL_game;
        obj2.i = tL_messageMediaPoll;
        obj2.m = tL_messageMediaInvoice;
        obj2.p = j;
        obj2.q = str3;
        obj2.r = k47Var;
        obj2.s = k47Var2;
        obj2.t = webPage;
        obj2.u = z;
        obj2.v = k47Var3;
        obj2.w = arrayList;
        obj2.x = replyMarkup;
        obj2.y = hashMap;
        obj2.z = z2;
        obj2.A = i;
        obj2.B = i2;
        obj2.C = i3;
        obj2.D = obj;
        obj2.E = g47Var;
        obj2.F = z3;
        obj2.G = z4;
        return obj2;
    }

    public static y5a d(TLRPC.MessageMedia messageMedia, long j, k47 k47Var, k47 k47Var2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z, int i) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j, null, k47Var, k47Var2, null, true, null, null, replyMarkup, hashMap, z, i, 0, 0, null, null, false, false);
    }

    public static y5a e(TLRPC.TL_document tL_document, rcc rccVar, String str, long j, k47 k47Var, k47 k47Var2, String str2, ArrayList arrayList, HashMap hashMap, boolean z, int i, int i2, int i3, Object obj, boolean z2) {
        return c(null, str2, null, null, rccVar, null, tL_document, null, null, null, j, str, k47Var, k47Var2, null, true, null, arrayList, null, hashMap, z, i, i2, i3, obj, null, false, z2);
    }

    public static y5a f(TLRPC.TL_document tL_document, rcc rccVar, String str, long j, k47 k47Var, k47 k47Var2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z, int i, int i2, int i3, Object obj, g47 g47Var, boolean z2) {
        return c(null, str2, null, null, rccVar, null, tL_document, null, null, null, j, str, k47Var, k47Var2, null, true, null, arrayList, replyMarkup, hashMap, z, i, i2, i3, obj, g47Var, z2, false);
    }

    public static y5a g(TLRPC.User user, long j, k47 k47Var, k47 k47Var2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z, int i, int i2) {
        return c(null, null, null, null, null, user, null, null, null, null, j, null, k47Var, k47Var2, null, true, null, null, replyMarkup, hashMap, z, i, i2, 0, null, null, false, false);
    }
}
