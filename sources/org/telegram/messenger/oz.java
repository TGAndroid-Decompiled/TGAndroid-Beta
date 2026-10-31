package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class oz {
    public int A;
    public int B;
    public int C;
    public Object D;
    public fj E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.kn J;
    public sw K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public oj T;
    public boolean U;
    public long V;
    public long W;
    public long X;
    public TL_iv.RichMessage Y;
    public ArrayList Z;
    public String f17366a;
    public String f17367b;
    public TLRPC.MessageMedia f17368c;
    public TLRPC.TL_photo d;
    public x20 e;
    public TLRPC.User f17369f;
    public TLRPC.TL_document f17370g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll f17371i;
    public ih.i f17372j;
    public int f17373k;
    public TLRPC.TL_messageMediaToDo f17374l;
    public TLRPC.TL_messageMediaInvoice f17375m;
    public TLRPC.TL_messageMediaWebPage f17376n;
    public TLRPC.PhotoSize f17377o;
    public long f17378p;
    public String f17379q;
    public jj f17380r;
    public jj f17381s;
    public TLRPC.WebPage f17382t;
    public boolean f17383u;
    public jj v;
    public ArrayList f17384w;
    public TLRPC.ReplyMarkup f17385x;
    public HashMap f17386y;
    public boolean f17387z;

    public static oz a(long j10, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j10, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static oz b(String str, long j10, jj jjVar, jj jjVar2, TLRPC.WebPage webPage, boolean z10, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i10, int i11, fj fjVar, boolean z12) {
        return c(str, null, null, null, null, null, null, null, null, null, j10, null, jjVar, jjVar2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i10, i11, 0, null, fjVar, z12, false);
    }

    public static oz c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, x20 x20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j10, String str3, jj jjVar, jj jjVar2, TLRPC.WebPage webPage, boolean z10, jj jjVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i10, int i11, int i12, Object obj, fj fjVar, boolean z12, boolean z13) {
        ?? obj2 = new Object();
        obj2.f17366a = str;
        obj2.f17367b = str2;
        obj2.f17368c = messageMedia;
        obj2.d = tL_photo;
        obj2.e = x20Var;
        obj2.f17369f = user;
        obj2.f17370g = tL_document;
        obj2.h = tL_game;
        obj2.f17371i = tL_messageMediaPoll;
        obj2.f17375m = tL_messageMediaInvoice;
        obj2.f17378p = j10;
        obj2.f17379q = str3;
        obj2.f17380r = jjVar;
        obj2.f17381s = jjVar2;
        obj2.f17382t = webPage;
        obj2.f17383u = z10;
        obj2.v = jjVar3;
        obj2.f17384w = arrayList;
        obj2.f17385x = replyMarkup;
        obj2.f17386y = hashMap;
        obj2.f17387z = z11;
        obj2.A = i10;
        obj2.B = i11;
        obj2.C = i12;
        obj2.D = obj;
        obj2.E = fjVar;
        obj2.F = z12;
        obj2.G = z13;
        return obj2;
    }

    public static oz d(TLRPC.MessageMedia messageMedia, long j10, jj jjVar, jj jjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i10) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j10, null, jjVar, jjVar2, null, true, null, null, replyMarkup, hashMap, z10, i10, 0, 0, null, null, false, false);
    }

    public static oz e(TLRPC.TL_document tL_document, x20 x20Var, String str, long j10, jj jjVar, jj jjVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z10, int i10, int i11, int i12, Object obj, boolean z11) {
        return c(null, str2, null, null, x20Var, null, tL_document, null, null, null, j10, str, jjVar, jjVar2, null, true, null, arrayList, null, hashMap, z10, i10, i11, i12, obj, null, false, z11);
    }

    public static oz f(TLRPC.TL_document tL_document, x20 x20Var, String str, long j10, jj jjVar, jj jjVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i10, int i11, int i12, Object obj, fj fjVar, boolean z11) {
        return c(null, str2, null, null, x20Var, null, tL_document, null, null, null, j10, str, jjVar, jjVar2, null, true, null, arrayList, replyMarkup, hashMap, z10, i10, i11, i12, obj, fjVar, z11, false);
    }

    public static oz g(TLRPC.User user, long j10, jj jjVar, jj jjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i10, int i11) {
        return c(null, null, null, null, null, user, null, null, null, null, j10, null, jjVar, jjVar2, null, true, null, null, replyMarkup, hashMap, z10, i10, i11, 0, null, null, false, false);
    }
}
