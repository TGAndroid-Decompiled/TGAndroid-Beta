package bg;

import ai.g1;
import android.content.Context;
import android.view.KeyEvent;
import bi.c5;
import fi.a8;
import fi.f7;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import jg.c1;
import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Components.df0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bh;
import org.telegram.ui.o60;
import org.telegram.ui.p40;
import org.telegram.ui.qr;
import org.telegram.ui.up;
public final class l0 implements RequestDelegate {
    public final int f3296a;
    public final int f3297b;
    public final Object f3298c;
    public final Object d;
    public final Object f3299e;
    public final Object f3300f;

    public l0(int i7, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f3296a = i10;
        this.f3297b = i7;
        this.f3298c = obj;
        this.d = obj2;
        this.f3299e = obj3;
        this.f3300f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f3296a;
        Object obj = this.f3299e;
        Object obj2 = this.d;
        Object obj3 = this.f3300f;
        Object obj4 = this.f3298c;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new m0(this.f3297b, 0, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (bh) obj, (s4) obj3, tLObject));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new m0((hi.d) obj4, tLObject, (x2[]) obj2, (i6) obj, this.f3297b, (TLRPC.TL_messages_checkChatInvite) obj3));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new g1((hi.d) obj4, (x2[]) obj2, this.f3297b, (TLObject) obj, (String) obj3, 2));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new m0((a8) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.f3297b));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new c5((c1) obj4, this.f3297b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (mp) obj3, 1));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new m0(this.f3297b, 6, (u1) obj4, (Context) obj2, (i6) obj, (p40) obj3, tLObject));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new c5(tL_error, tLObject, (ArrayList) obj4, this.f3297b, (AtomicInteger) obj2, (ArrayList) obj, (up) obj3, 7));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new m0((df0) obj4, (Integer[]) obj2, this.f3297b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new c5((u1) obj4, tLObject, this.f3297b, (TLRPC.Document) obj2, tL_error, this.f3299e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new m0((qr) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.f3297b));
                return;
            case 10:
                org.telegram.messenger.g0.g3(new c5((u1) obj4, (vf.b) obj2, tLObject, this.f3297b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error, 9));
                return;
            case 11:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new c5((LaunchActivity) obj4, tLObject, (vf.b) obj2, tL_error, (mp) obj, this.f3297b, (String) obj3, 11));
                return;
            case 12:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new c5((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (o60) obj, this.f3297b, (String) obj3, 13));
                return;
            case 13:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new c5((LaunchActivity) obj4, tL_error, tLObject, this.f3297b, (u1) obj2, (o60) obj, (String) obj3));
                return;
            default:
                org.telegram.messenger.g0.g3(new c5((org.telegram.ui.web.v0) obj4, (String) obj2, tLObject, tL_error, this.f3297b, (org.telegram.ui.web.s0) obj, (f7) obj3));
                return;
        }
    }

    public l0(KeyEvent.Callback callback, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f3296a = i10;
        this.f3298c = callback;
        this.d = obj;
        this.f3297b = i7;
        this.f3299e = obj2;
        this.f3300f = obj3;
    }

    public l0(KeyEvent.Callback callback, Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f3296a = i10;
        this.f3298c = callback;
        this.d = obj;
        this.f3299e = obj2;
        this.f3297b = i7;
        this.f3300f = obj3;
    }

    public l0(Object obj, int i7, Object obj2, Object obj3, Object obj4, int i10) {
        this.f3296a = i10;
        this.f3298c = obj;
        this.f3297b = i7;
        this.d = obj2;
        this.f3299e = obj3;
        this.f3300f = obj4;
    }

    public l0(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.f3296a = i10;
        this.f3298c = obj;
        this.d = obj2;
        this.f3299e = obj3;
        this.f3300f = obj4;
        this.f3297b = i7;
    }
}
