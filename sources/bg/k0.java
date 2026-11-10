package bg;

import android.content.Context;
import android.view.KeyEvent;
import bi.ub;
import di.l8;
import di.p7;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import jg.c1;
import jg.d1;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dh;
import org.telegram.ui.f10;
import org.telegram.ui.p40;
import org.telegram.ui.qr;
import org.telegram.ui.tp;
import org.telegram.ui.web.x0;
public final class k0 implements RequestDelegate {
    public final int f3341a;
    public final int f3342b;
    public final Object f3343c;
    public final Object d;
    public final Object f3344e;
    public final Object f3345f;

    public k0(int i7, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f3341a = i10;
        this.f3342b = i7;
        this.f3343c = obj;
        this.d = obj2;
        this.f3344e = obj3;
        this.f3345f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f3341a;
        Object obj = this.f3344e;
        Object obj2 = this.d;
        Object obj3 = this.f3345f;
        Object obj4 = this.f3343c;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new l0(this.f3342b, 0, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (dh) obj, (r4) obj3, tLObject));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new l0((fi.d) obj4, tLObject, (w2[]) obj2, (h6) obj, this.f3342b, (TLRPC.TL_messages_checkChatInvite) obj3));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ub((fi.d) obj4, (w2[]) obj2, this.f3342b, (TLObject) obj, (String) obj3, 0));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new l0((l8) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.f3342b));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new c1((d1) obj4, this.f3342b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (qp) obj3, 0));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new l0(this.f3342b, 6, (u1) obj4, (Context) obj2, (h6) obj, (p40) obj3, tLObject));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new c1(tL_error, tLObject, (ArrayList) obj4, this.f3342b, (AtomicInteger) obj2, (ArrayList) obj, (tp) obj3));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new l0((qe0) obj4, (Integer[]) obj2, this.f3342b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new c1((u1) obj4, tLObject, this.f3342b, (TLRPC.Document) obj2, tL_error, this.f3344e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new l0((qr) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.f3342b));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new c1((u1) obj4, (vf.b) obj2, tLObject, this.f3342b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error));
                return;
            case 11:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new c1((LaunchActivity) obj4, tLObject, (vf.b) obj2, tL_error, (qp) obj, this.f3342b, (String) obj3));
                return;
            case 12:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new c1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (f10) obj, this.f3342b, (String) obj3));
                return;
            case 13:
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new c1((LaunchActivity) obj4, tL_error, tLObject, this.f3342b, (u1) obj2, (f10) obj, (String) obj3));
                return;
            default:
                org.telegram.messenger.g0.h3(new c1((x0) obj4, (String) obj2, tLObject, tL_error, this.f3342b, (org.telegram.ui.web.u0) obj, (p7) obj3));
                return;
        }
    }

    public k0(KeyEvent.Callback callback, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f3341a = i10;
        this.f3343c = callback;
        this.d = obj;
        this.f3342b = i7;
        this.f3344e = obj2;
        this.f3345f = obj3;
    }

    public k0(KeyEvent.Callback callback, Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f3341a = i10;
        this.f3343c = callback;
        this.d = obj;
        this.f3344e = obj2;
        this.f3342b = i7;
        this.f3345f = obj3;
    }

    public k0(Object obj, int i7, Object obj2, Object obj3, Object obj4, int i10) {
        this.f3341a = i10;
        this.f3343c = obj;
        this.f3342b = i7;
        this.d = obj2;
        this.f3344e = obj3;
        this.f3345f = obj4;
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.f3341a = i10;
        this.f3343c = obj;
        this.d = obj2;
        this.f3344e = obj3;
        this.f3345f = obj4;
        this.f3342b = i7;
    }
}
