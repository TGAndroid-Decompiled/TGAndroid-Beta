package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class pz {
    public int A;
    public int B;
    public int C;
    public Object D;
    public gj E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.kn J;
    public tw K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public pj T;
    public boolean U;
    public long V;
    public long W;
    public long X;
    public TL_iv.RichMessage Y;
    public ArrayList Z;
    public String f17699a;
    public String f17700b;
    public TLRPC.MessageMedia f17701c;
    public TLRPC.TL_photo d;
    public y20 e;
    public TLRPC.User f17702f;
    public TLRPC.TL_document f17703g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll f17704i;
    public ih.i f17705j;
    public int f17706k;
    public TLRPC.TL_messageMediaToDo f17707l;
    public TLRPC.TL_messageMediaInvoice f17708m;
    public TLRPC.TL_messageMediaWebPage f17709n;
    public TLRPC.PhotoSize f17710o;
    public long f17711p;
    public String f17712q;
    public kj f17713r;
    public kj f17714s;
    public TLRPC.WebPage f17715t;
    public boolean f17716u;
    public kj v;
    public ArrayList f17717w;
    public TLRPC.ReplyMarkup f17718x;
    public HashMap f17719y;
    public boolean f17720z;

    public static pz a(long j10, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j10, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static pz b(String str, long j10, kj kjVar, kj kjVar2, TLRPC.WebPage webPage, boolean z10, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i10, int i11, gj gjVar, boolean z12) {
        return c(str, null, null, null, null, null, null, null, null, null, j10, null, kjVar, kjVar2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i10, i11, 0, null, gjVar, z12, false);
    }

    public static pz c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, y20 y20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j10, String str3, kj kjVar, kj kjVar2, TLRPC.WebPage webPage, boolean z10, kj kjVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i10, int i11, int i12, Object obj, gj gjVar, boolean z12, boolean z13) {
        ?? obj2 = new Object();
        obj2.f17699a = str;
        obj2.f17700b = str2;
        obj2.f17701c = messageMedia;
        obj2.d = tL_photo;
        obj2.e = y20Var;
        obj2.f17702f = user;
        obj2.f17703g = tL_document;
        obj2.h = tL_game;
        obj2.f17704i = tL_messageMediaPoll;
        obj2.f17708m = tL_messageMediaInvoice;
        obj2.f17711p = j10;
        obj2.f17712q = str3;
        obj2.f17713r = kjVar;
        obj2.f17714s = kjVar2;
        obj2.f17715t = webPage;
        obj2.f17716u = z10;
        obj2.v = kjVar3;
        obj2.f17717w = arrayList;
        obj2.f17718x = replyMarkup;
        obj2.f17719y = hashMap;
        obj2.f17720z = z11;
        obj2.A = i10;
        obj2.B = i11;
        obj2.C = i12;
        obj2.D = obj;
        obj2.E = gjVar;
        obj2.F = z12;
        obj2.G = z13;
        return obj2;
    }

    public static pz d(TLRPC.MessageMedia messageMedia, long j10, kj kjVar, kj kjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i10) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j10, null, kjVar, kjVar2, null, true, null, null, replyMarkup, hashMap, z10, i10, 0, 0, null, null, false, false);
    }

    public static pz e(TLRPC.TL_document tL_document, y20 y20Var, String str, long j10, kj kjVar, kj kjVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z10, int i10, int i11, int i12, Object obj, boolean z11) {
        return c(null, str2, null, null, y20Var, null, tL_document, null, null, null, j10, str, kjVar, kjVar2, null, true, null, arrayList, null, hashMap, z10, i10, i11, i12, obj, null, false, z11);
    }

    public static pz f(TLRPC.TL_document tL_document, y20 y20Var, String str, long j10, kj kjVar, kj kjVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i10, int i11, int i12, Object obj, gj gjVar, boolean z11) {
        return c(null, str2, null, null, y20Var, null, tL_document, null, null, null, j10, str, kjVar, kjVar2, null, true, null, arrayList, replyMarkup, hashMap, z10, i10, i11, i12, obj, gjVar, z11, false);
    }

    public static pz g(TLRPC.User user, long j10, kj kjVar, kj kjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i10, int i11) {
        return c(null, null, null, null, null, user, null, null, null, null, j10, null, kjVar, kjVar2, null, true, null, null, replyMarkup, hashMap, z10, i10, i11, 0, null, null, false, false);
    }
}
