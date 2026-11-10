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
    public String f22316a;
    public String f22317b;
    public TLRPC.MessageMedia f22318c;
    public TLRPC.TL_photo d;
    public j20 f22319e;
    public TLRPC.User f22320f;
    public TLRPC.TL_document f22321g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll f22322i;
    public sh.g f22323j;
    public int f22324k;
    public TLRPC.TL_messageMediaToDo f22325l;
    public TLRPC.TL_messageMediaInvoice f22326m;
    public TLRPC.TL_messageMediaWebPage f22327n;
    public TLRPC.PhotoSize f22328o;
    public long f22329p;
    public String f22330q;
    public ij f22331r;
    public ij f22332s;
    public TLRPC.WebPage f22333t;
    public boolean f22334u;
    public ij v;
    public ArrayList f22335w;
    public TLRPC.ReplyMarkup f22336x;
    public HashMap f22337y;
    public boolean f22338z;

    public static ez a(long j3, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static ez b(String str, long j3, ij ijVar, ij ijVar2, TLRPC.WebPage webPage, boolean z9, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10, ej ejVar, boolean z11) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, ijVar, ijVar2, webPage, z9, null, arrayList, replyMarkup, hashMap, z10, i7, i10, 0, null, ejVar, z11, false);
    }

    public static ez c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, j20 j20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j3, String str3, ij ijVar, ij ijVar2, TLRPC.WebPage webPage, boolean z9, ij ijVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, ej ejVar, boolean z11, boolean z12) {
        ?? obj2 = new Object();
        obj2.f22316a = str;
        obj2.f22317b = str2;
        obj2.f22318c = messageMedia;
        obj2.d = tL_photo;
        obj2.f22319e = j20Var;
        obj2.f22320f = user;
        obj2.f22321g = tL_document;
        obj2.h = tL_game;
        obj2.f22322i = tL_messageMediaPoll;
        obj2.f22326m = tL_messageMediaInvoice;
        obj2.f22329p = j3;
        obj2.f22330q = str3;
        obj2.f22331r = ijVar;
        obj2.f22332s = ijVar2;
        obj2.f22333t = webPage;
        obj2.f22334u = z9;
        obj2.v = ijVar3;
        obj2.f22335w = arrayList;
        obj2.f22336x = replyMarkup;
        obj2.f22337y = hashMap;
        obj2.f22338z = z10;
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
