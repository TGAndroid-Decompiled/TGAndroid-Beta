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
    public String f28035a;
    public String f28036b;
    public TLRPC.MessageMedia f28037c;
    public TLRPC.TL_photo d;
    public e20 f28038e;
    public TLRPC.User f28039f;
    public TLRPC.TL_document f28040g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll f28041i;
    public sh.g f28042j;
    public int f28043k;
    public TLRPC.TL_messageMediaToDo f28044l;
    public TLRPC.TL_messageMediaInvoice f28045m;
    public TLRPC.TL_messageMediaWebPage f28046n;
    public TLRPC.PhotoSize f28047o;
    public long f28048p;
    public String f28049q;
    public fj f28050r;
    public fj f28051s;
    public TLRPC.WebPage f28052t;
    public boolean f28053u;
    public fj v;
    public ArrayList f28054w;
    public TLRPC.ReplyMarkup f28055x;
    public HashMap f28056y;
    public boolean f28057z;

    public static xy a(long j3, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static xy b(String str, long j3, fj fjVar, fj fjVar2, TLRPC.WebPage webPage, boolean z10, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, bj bjVar, boolean z12) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, fjVar, fjVar2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i7, i10, 0, null, bjVar, z12, false);
    }

    public static xy c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, e20 e20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j3, String str3, fj fjVar, fj fjVar2, TLRPC.WebPage webPage, boolean z10, fj fjVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, int i11, Object obj, bj bjVar, boolean z12, boolean z13) {
        ?? obj2 = new Object();
        obj2.f28035a = str;
        obj2.f28036b = str2;
        obj2.f28037c = messageMedia;
        obj2.d = tL_photo;
        obj2.f28038e = e20Var;
        obj2.f28039f = user;
        obj2.f28040g = tL_document;
        obj2.h = tL_game;
        obj2.f28041i = tL_messageMediaPoll;
        obj2.f28045m = tL_messageMediaInvoice;
        obj2.f28048p = j3;
        obj2.f28049q = str3;
        obj2.f28050r = fjVar;
        obj2.f28051s = fjVar2;
        obj2.f28052t = webPage;
        obj2.f28053u = z10;
        obj2.v = fjVar3;
        obj2.f28054w = arrayList;
        obj2.f28055x = replyMarkup;
        obj2.f28056y = hashMap;
        obj2.f28057z = z11;
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
