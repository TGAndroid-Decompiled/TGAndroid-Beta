package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class x3a {
    public int A;
    public int B;
    public int C;
    public Object D;
    public g27 E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public bu1 J;
    public j1a K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public u47 T;
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
    public oac e;
    public TLRPC.User f;
    public TLRPC.TL_document g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll i;
    public we8 j;
    public int k;
    public TLRPC.TL_messageMediaToDo l;
    public TLRPC.TL_messageMediaInvoice m;
    public TLRPC.TL_messageMediaWebPage n;
    public TLRPC.PhotoSize o;
    public long p;
    public String q;
    public k27 r;
    public k27 s;
    public TLRPC.WebPage t;
    public boolean u;
    public k27 v;
    public ArrayList w;
    public TLRPC.ReplyMarkup x;
    public HashMap y;
    public boolean z;

    public static x3a a(long j, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static x3a b(String str, long j, k27 k27Var, k27 k27Var2, TLRPC.WebPage webPage, boolean z, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z2, int i, int i2, g27 g27Var, boolean z3) {
        return c(str, null, null, null, null, null, null, null, null, null, j, null, k27Var, k27Var2, webPage, z, null, arrayList, replyMarkup, hashMap, z2, i, i2, 0, null, g27Var, z3, false);
    }

    public static x3a c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, oac oacVar, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j, String str3, k27 k27Var, k27 k27Var2, TLRPC.WebPage webPage, boolean z, k27 k27Var3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z2, int i, int i2, int i3, Object obj, g27 g27Var, boolean z3, boolean z4) {
        ?? obj2 = new Object();
        obj2.a = str;
        obj2.b = str2;
        obj2.c = messageMedia;
        obj2.d = tL_photo;
        obj2.e = oacVar;
        obj2.f = user;
        obj2.g = tL_document;
        obj2.h = tL_game;
        obj2.i = tL_messageMediaPoll;
        obj2.m = tL_messageMediaInvoice;
        obj2.p = j;
        obj2.q = str3;
        obj2.r = k27Var;
        obj2.s = k27Var2;
        obj2.t = webPage;
        obj2.u = z;
        obj2.v = k27Var3;
        obj2.w = arrayList;
        obj2.x = replyMarkup;
        obj2.y = hashMap;
        obj2.z = z2;
        obj2.A = i;
        obj2.B = i2;
        obj2.C = i3;
        obj2.D = obj;
        obj2.E = g27Var;
        obj2.F = z3;
        obj2.G = z4;
        return obj2;
    }

    public static x3a d(TLRPC.MessageMedia messageMedia, long j, k27 k27Var, k27 k27Var2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z, int i) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j, null, k27Var, k27Var2, null, true, null, null, replyMarkup, hashMap, z, i, 0, 0, null, null, false, false);
    }

    public static x3a e(TLRPC.TL_document tL_document, oac oacVar, String str, long j, k27 k27Var, k27 k27Var2, String str2, ArrayList arrayList, HashMap hashMap, boolean z, int i, int i2, int i3, Object obj, boolean z2) {
        return c(null, str2, null, null, oacVar, null, tL_document, null, null, null, j, str, k27Var, k27Var2, null, true, null, arrayList, null, hashMap, z, i, i2, i3, obj, null, false, z2);
    }

    public static x3a f(TLRPC.TL_document tL_document, oac oacVar, String str, long j, k27 k27Var, k27 k27Var2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z, int i, int i2, int i3, Object obj, g27 g27Var, boolean z2) {
        return c(null, str2, null, null, oacVar, null, tL_document, null, null, null, j, str, k27Var, k27Var2, null, true, null, arrayList, replyMarkup, hashMap, z, i, i2, i3, obj, g27Var, z2, false);
    }

    public static x3a g(TLRPC.User user, long j, k27 k27Var, k27 k27Var2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z, int i, int i2) {
        return c(null, null, null, null, null, user, null, null, null, null, j, null, k27Var, k27Var2, null, true, null, null, replyMarkup, hashMap, z, i, i2, 0, null, null, false, false);
    }
}
