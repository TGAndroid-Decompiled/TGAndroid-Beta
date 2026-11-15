package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class cz {
    public int A;
    public int B;
    public int C;
    public Object D;
    public cj E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.qm J;
    public fw K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public lj T;
    public boolean U;
    public long V;
    public long W;
    public long X;
    public TL_iv.RichMessage Y;
    public ArrayList Z;
    public String f22986a;
    public String f22987b;
    public TLRPC.MessageMedia f22988c;
    public TLRPC.TL_photo d;
    public g20 f22989e;
    public TLRPC.User f22990f;
    public TLRPC.TL_document f22991g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll f22992i;
    public sh.f f22993j;
    public int f22994k;
    public TLRPC.TL_messageMediaToDo f22995l;
    public TLRPC.TL_messageMediaInvoice f22996m;
    public TLRPC.TL_messageMediaWebPage f22997n;
    public TLRPC.PhotoSize f22998o;
    public long f22999p;
    public String f23000q;
    public gj f23001r;
    public gj f23002s;
    public TLRPC.WebPage f23003t;
    public boolean f23004u;
    public gj v;
    public ArrayList f23005w;
    public TLRPC.ReplyMarkup f23006x;
    public HashMap f23007y;
    public boolean f23008z;

    public static cz a(long j3, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static cz b(String str, long j3, gj gjVar, gj gjVar2, TLRPC.WebPage webPage, boolean z10, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, cj cjVar, boolean z12) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, gjVar, gjVar2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i7, i10, 0, null, cjVar, z12, false);
    }

    public static cz c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, g20 g20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j3, String str3, gj gjVar, gj gjVar2, TLRPC.WebPage webPage, boolean z10, gj gjVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, int i11, Object obj, cj cjVar, boolean z12, boolean z13) {
        ?? obj2 = new Object();
        obj2.f22986a = str;
        obj2.f22987b = str2;
        obj2.f22988c = messageMedia;
        obj2.d = tL_photo;
        obj2.f22989e = g20Var;
        obj2.f22990f = user;
        obj2.f22991g = tL_document;
        obj2.h = tL_game;
        obj2.f22992i = tL_messageMediaPoll;
        obj2.f22996m = tL_messageMediaInvoice;
        obj2.f22999p = j3;
        obj2.f23000q = str3;
        obj2.f23001r = gjVar;
        obj2.f23002s = gjVar2;
        obj2.f23003t = webPage;
        obj2.f23004u = z10;
        obj2.v = gjVar3;
        obj2.f23005w = arrayList;
        obj2.f23006x = replyMarkup;
        obj2.f23007y = hashMap;
        obj2.f23008z = z11;
        obj2.A = i7;
        obj2.B = i10;
        obj2.C = i11;
        obj2.D = obj;
        obj2.E = cjVar;
        obj2.F = z12;
        obj2.G = z13;
        return obj2;
    }

    public static cz d(TLRPC.MessageMedia messageMedia, long j3, gj gjVar, gj gjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j3, null, gjVar, gjVar2, null, true, null, null, replyMarkup, hashMap, z10, i7, 0, 0, null, null, false, false);
    }

    public static cz e(TLRPC.TL_document tL_document, g20 g20Var, String str, long j3, gj gjVar, gj gjVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, boolean z11) {
        return c(null, str2, null, null, g20Var, null, tL_document, null, null, null, j3, str, gjVar, gjVar2, null, true, null, arrayList, null, hashMap, z10, i7, i10, i11, obj, null, false, z11);
    }

    public static cz f(TLRPC.TL_document tL_document, g20 g20Var, String str, long j3, gj gjVar, gj gjVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, cj cjVar, boolean z11) {
        return c(null, str2, null, null, g20Var, null, tL_document, null, null, null, j3, str, gjVar, gjVar2, null, true, null, arrayList, replyMarkup, hashMap, z10, i7, i10, i11, obj, cjVar, z11, false);
    }

    public static cz g(TLRPC.User user, long j3, gj gjVar, gj gjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10) {
        return c(null, null, null, null, null, user, null, null, null, null, j3, null, gjVar, gjVar2, null, true, null, null, replyMarkup, hashMap, z10, i7, i10, 0, null, null, false, false);
    }
}
