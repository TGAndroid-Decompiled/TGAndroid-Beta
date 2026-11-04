package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class wy {
    public int A;
    public int B;
    public int C;
    public Object D;
    public vi E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.mm J;
    public zv K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public ej T;
    public boolean U;
    public long V;
    public long W;
    public long X;
    public TL_iv.RichMessage Y;
    public ArrayList Z;
    public String f26290a;
    public String f26291b;
    public TLRPC.MessageMedia f26292c;
    public TLRPC.TL_photo d;
    public b20 f26293e;
    public TLRPC.User f26294f;
    public TLRPC.TL_document f26295g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll f26296i;
    public th.f f26297j;
    public int f26298k;
    public TLRPC.TL_messageMediaToDo f26299l;
    public TLRPC.TL_messageMediaInvoice f26300m;
    public TLRPC.TL_messageMediaWebPage f26301n;
    public TLRPC.PhotoSize f26302o;
    public long f26303p;
    public String f26304q;
    public zi f26305r;
    public zi f26306s;
    public TLRPC.WebPage f26307t;
    public boolean f26308u;
    public zi v;
    public ArrayList f26309w;
    public TLRPC.ReplyMarkup f26310x;
    public HashMap f26311y;
    public boolean f26312z;

    public static wy a(long j10, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j10, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static wy b(String str, long j10, zi ziVar, zi ziVar2, TLRPC.WebPage webPage, boolean z10, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i3, int i10, vi viVar, boolean z12) {
        return c(str, null, null, null, null, null, null, null, null, null, j10, null, ziVar, ziVar2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i3, i10, 0, null, viVar, z12, false);
    }

    public static wy c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, b20 b20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j10, String str3, zi ziVar, zi ziVar2, TLRPC.WebPage webPage, boolean z10, zi ziVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i3, int i10, int i11, Object obj, vi viVar, boolean z12, boolean z13) {
        ?? obj2 = new Object();
        obj2.f26290a = str;
        obj2.f26291b = str2;
        obj2.f26292c = messageMedia;
        obj2.d = tL_photo;
        obj2.f26293e = b20Var;
        obj2.f26294f = user;
        obj2.f26295g = tL_document;
        obj2.h = tL_game;
        obj2.f26296i = tL_messageMediaPoll;
        obj2.f26300m = tL_messageMediaInvoice;
        obj2.f26303p = j10;
        obj2.f26304q = str3;
        obj2.f26305r = ziVar;
        obj2.f26306s = ziVar2;
        obj2.f26307t = webPage;
        obj2.f26308u = z10;
        obj2.v = ziVar3;
        obj2.f26309w = arrayList;
        obj2.f26310x = replyMarkup;
        obj2.f26311y = hashMap;
        obj2.f26312z = z11;
        obj2.A = i3;
        obj2.B = i10;
        obj2.C = i11;
        obj2.D = obj;
        obj2.E = viVar;
        obj2.F = z12;
        obj2.G = z13;
        return obj2;
    }

    public static wy d(TLRPC.MessageMedia messageMedia, long j10, zi ziVar, zi ziVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i3) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j10, null, ziVar, ziVar2, null, true, null, null, replyMarkup, hashMap, z10, i3, 0, 0, null, null, false, false);
    }

    public static wy e(TLRPC.TL_document tL_document, b20 b20Var, String str, long j10, zi ziVar, zi ziVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z10, int i3, int i10, int i11, Object obj, boolean z11) {
        return c(null, str2, null, null, b20Var, null, tL_document, null, null, null, j10, str, ziVar, ziVar2, null, true, null, arrayList, null, hashMap, z10, i3, i10, i11, obj, null, false, z11);
    }

    public static wy f(TLRPC.TL_document tL_document, b20 b20Var, String str, long j10, zi ziVar, zi ziVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i3, int i10, int i11, Object obj, vi viVar, boolean z11) {
        return c(null, str2, null, null, b20Var, null, tL_document, null, null, null, j10, str, ziVar, ziVar2, null, true, null, arrayList, replyMarkup, hashMap, z10, i3, i10, i11, obj, viVar, z11, false);
    }

    public static wy g(TLRPC.User user, long j10, zi ziVar, zi ziVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i3, int i10) {
        return c(null, null, null, null, null, user, null, null, null, null, j10, null, ziVar, ziVar2, null, true, null, null, replyMarkup, hashMap, z10, i3, i10, 0, null, null, false, false);
    }
}
