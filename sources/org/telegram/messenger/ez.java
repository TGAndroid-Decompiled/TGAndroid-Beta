package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class ez {
    public int A;
    public int B;
    public int C;
    public Object D;
    public ej E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.sm J;
    public hw K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public nj T;
    public boolean U;
    public long V;
    public long W;
    public long X;
    public TL_iv.RichMessage Y;
    public ArrayList Z;
    public String f22312a;
    public String f22313b;
    public TLRPC.MessageMedia f22314c;
    public TLRPC.TL_photo d;
    public j20 f22315e;
    public TLRPC.User f22316f;
    public TLRPC.TL_document f22317g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll f22318i;
    public sh.g f22319j;
    public int f22320k;
    public TLRPC.TL_messageMediaToDo f22321l;
    public TLRPC.TL_messageMediaInvoice f22322m;
    public TLRPC.TL_messageMediaWebPage f22323n;
    public TLRPC.PhotoSize f22324o;
    public long f22325p;
    public String f22326q;
    public ij f22327r;
    public ij f22328s;
    public TLRPC.WebPage f22329t;
    public boolean f22330u;
    public ij v;
    public ArrayList f22331w;
    public TLRPC.ReplyMarkup f22332x;
    public HashMap f22333y;
    public boolean f22334z;

    public static ez a(long j3, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static ez b(String str, long j3, ij ijVar, ij ijVar2, TLRPC.WebPage webPage, boolean z9, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10, ej ejVar, boolean z11) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, ijVar, ijVar2, webPage, z9, null, arrayList, replyMarkup, hashMap, z10, i7, i10, 0, null, ejVar, z11, false);
    }

    public static ez c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, j20 j20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j3, String str3, ij ijVar, ij ijVar2, TLRPC.WebPage webPage, boolean z9, ij ijVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, ej ejVar, boolean z11, boolean z12) {
        ?? obj2 = new Object();
        obj2.f22312a = str;
        obj2.f22313b = str2;
        obj2.f22314c = messageMedia;
        obj2.d = tL_photo;
        obj2.f22315e = j20Var;
        obj2.f22316f = user;
        obj2.f22317g = tL_document;
        obj2.h = tL_game;
        obj2.f22318i = tL_messageMediaPoll;
        obj2.f22322m = tL_messageMediaInvoice;
        obj2.f22325p = j3;
        obj2.f22326q = str3;
        obj2.f22327r = ijVar;
        obj2.f22328s = ijVar2;
        obj2.f22329t = webPage;
        obj2.f22330u = z9;
        obj2.v = ijVar3;
        obj2.f22331w = arrayList;
        obj2.f22332x = replyMarkup;
        obj2.f22333y = hashMap;
        obj2.f22334z = z10;
        obj2.A = i7;
        obj2.B = i10;
        obj2.C = i11;
        obj2.D = obj;
        obj2.E = ejVar;
        obj2.F = z11;
        obj2.G = z12;
        return obj2;
    }

    public static ez d(TLRPC.MessageMedia messageMedia, long j3, ij ijVar, ij ijVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z9, int i7) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j3, null, ijVar, ijVar2, null, true, null, null, replyMarkup, hashMap, z9, i7, 0, 0, null, null, false, false);
    }

    public static ez e(TLRPC.TL_document tL_document, j20 j20Var, String str, long j3, ij ijVar, ij ijVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z9, int i7, int i10, int i11, Object obj, boolean z10) {
        return c(null, str2, null, null, j20Var, null, tL_document, null, null, null, j3, str, ijVar, ijVar2, null, true, null, arrayList, null, hashMap, z9, i7, i10, i11, obj, null, false, z10);
    }

    public static ez f(TLRPC.TL_document tL_document, j20 j20Var, String str, long j3, ij ijVar, ij ijVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z9, int i7, int i10, int i11, Object obj, ej ejVar, boolean z10) {
        return c(null, str2, null, null, j20Var, null, tL_document, null, null, null, j3, str, ijVar, ijVar2, null, true, null, arrayList, replyMarkup, hashMap, z9, i7, i10, i11, obj, ejVar, z10, false);
    }

    public static ez g(TLRPC.User user, long j3, ij ijVar, ij ijVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z9, int i7, int i10) {
        return c(null, null, null, null, null, user, null, null, null, null, j3, null, ijVar, ijVar2, null, true, null, null, replyMarkup, hashMap, z9, i7, i10, 0, null, null, false, false);
    }
}
