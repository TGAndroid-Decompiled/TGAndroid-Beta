package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class xy {
    public int A;
    public int B;
    public int C;
    public Object D;
    public bj E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.rm J;
    public bw K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public kj T;
    public boolean U;
    public long V;
    public long W;
    public long X;
    public TL_iv.RichMessage Y;
    public ArrayList Z;
    public String f28037a;
    public String f28038b;
    public TLRPC.MessageMedia f28039c;
    public TLRPC.TL_photo d;
    public e20 f28040e;
    public TLRPC.User f28041f;
    public TLRPC.TL_document f28042g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll f28043i;
    public sh.g f28044j;
    public int f28045k;
    public TLRPC.TL_messageMediaToDo f28046l;
    public TLRPC.TL_messageMediaInvoice f28047m;
    public TLRPC.TL_messageMediaWebPage f28048n;
    public TLRPC.PhotoSize f28049o;
    public long f28050p;
    public String f28051q;
    public fj f28052r;
    public fj f28053s;
    public TLRPC.WebPage f28054t;
    public boolean f28055u;
    public fj v;
    public ArrayList f28056w;
    public TLRPC.ReplyMarkup f28057x;
    public HashMap f28058y;
    public boolean f28059z;

    public static xy a(long j3, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static xy b(String str, long j3, fj fjVar, fj fjVar2, TLRPC.WebPage webPage, boolean z10, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, bj bjVar, boolean z12) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, fjVar, fjVar2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i7, i10, 0, null, bjVar, z12, false);
    }

    public static xy c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, e20 e20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j3, String str3, fj fjVar, fj fjVar2, TLRPC.WebPage webPage, boolean z10, fj fjVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, int i11, Object obj, bj bjVar, boolean z12, boolean z13) {
        ?? obj2 = new Object();
        obj2.f28037a = str;
        obj2.f28038b = str2;
        obj2.f28039c = messageMedia;
        obj2.d = tL_photo;
        obj2.f28040e = e20Var;
        obj2.f28041f = user;
        obj2.f28042g = tL_document;
        obj2.h = tL_game;
        obj2.f28043i = tL_messageMediaPoll;
        obj2.f28047m = tL_messageMediaInvoice;
        obj2.f28050p = j3;
        obj2.f28051q = str3;
        obj2.f28052r = fjVar;
        obj2.f28053s = fjVar2;
        obj2.f28054t = webPage;
        obj2.f28055u = z10;
        obj2.v = fjVar3;
        obj2.f28056w = arrayList;
        obj2.f28057x = replyMarkup;
        obj2.f28058y = hashMap;
        obj2.f28059z = z11;
        obj2.A = i7;
        obj2.B = i10;
        obj2.C = i11;
        obj2.D = obj;
        obj2.E = bjVar;
        obj2.F = z12;
        obj2.G = z13;
        return obj2;
    }

    public static xy d(TLRPC.MessageMedia messageMedia, long j3, fj fjVar, fj fjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j3, null, fjVar, fjVar2, null, true, null, null, replyMarkup, hashMap, z10, i7, 0, 0, null, null, false, false);
    }

    public static xy e(TLRPC.TL_document tL_document, e20 e20Var, String str, long j3, fj fjVar, fj fjVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, boolean z11) {
        return c(null, str2, null, null, e20Var, null, tL_document, null, null, null, j3, str, fjVar, fjVar2, null, true, null, arrayList, null, hashMap, z10, i7, i10, i11, obj, null, false, z11);
    }

    public static xy f(TLRPC.TL_document tL_document, e20 e20Var, String str, long j3, fj fjVar, fj fjVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, bj bjVar, boolean z11) {
        return c(null, str2, null, null, e20Var, null, tL_document, null, null, null, j3, str, fjVar, fjVar2, null, true, null, arrayList, replyMarkup, hashMap, z10, i7, i10, i11, obj, bjVar, z11, false);
    }

    public static xy g(TLRPC.User user, long j3, fj fjVar, fj fjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10) {
        return c(null, null, null, null, null, user, null, null, null, null, j3, null, fjVar, fjVar2, null, true, null, null, replyMarkup, hashMap, z10, i7, i10, 0, null, null, false, false);
    }
}
