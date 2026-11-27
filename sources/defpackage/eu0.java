package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class eu0 implements RequestDelegate {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public eu0(c51 c51Var, nx0[] nx0VarArr, int i, TLObject tLObject, String str) {
        this.a = (byte) 12;
        this.c = c51Var;
        this.e = nx0VarArr;
        this.b = i;
        this.f = tLObject;
        this.d = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                hl.c3(new st((rv0) obj4, (String) obj, tLObject, tL_error, this.b, (nv0) obj2, (pv0) obj3));
                return;
            case 1:
                hl.c3(new te(tLObject, this.b, (id) obj4, (Context) obj, (vnb) obj2, (gc5) obj3));
                return;
            case 2:
                hl.c3(new te((vc2) obj4, this.b, tLObject, (ps0) obj, (ArrayList) obj2, (HashSet) obj3, (byte) 5));
                return;
            case 3:
                hl.c3(new st(tL_error, tLObject, (ArrayList) obj4, this.b, (AtomicInteger) obj, (ArrayList) obj2, (on1) obj3));
                return;
            case 4:
                hl.c3(new st((id) obj4, (l01) obj, tLObject, this.b, (Activity) obj2, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error));
                return;
            case 5:
                String str = LaunchActivity.C1;
                hl.c3(new st((LaunchActivity) obj4, tLObject, (l01) obj2, tL_error, (uc7) obj3, this.b, (String) obj, (byte) 9));
                return;
            case 6:
                String str2 = LaunchActivity.C1;
                hl.c3(new st((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (tg5) obj3, this.b, (String) obj));
                return;
            case 7:
                String str3 = LaunchActivity.C1;
                hl.c3(new st((LaunchActivity) obj4, tL_error, tLObject, this.b, (id) obj2, (tg5) obj3, (String) obj));
                return;
            case 8:
                hl.c3(new st((n17) obj4, this.b, (ArrayList) obj, (zh6) obj2, tL_error, tLObject, (uc7) obj3));
                return;
            case 9:
                hl.c3(new te(tLObject, this.b, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj, (bt1) obj2, (wk5) obj3, (byte) 8));
                return;
            case 10:
                hl.c3(new te((ui8) obj4, (Integer[]) obj, this.b, tLObject, (ArrayList) obj2, (TLRPC.PollAnswerVoters) obj3, (byte) 9));
                return;
            case 11:
                hl.c3(new te((c51) obj4, tLObject, (nx0[]) obj, (vnb) obj2, this.b, (TLRPC.TL_messages_checkChatInvite) obj3));
                return;
            case 12:
                hl.c3(new l77((c51) obj4, (nx0[]) obj2, this.b, (TLObject) obj3, (String) obj, (byte) 26));
                return;
            case 13:
                hl.c3(new st((id) obj4, tLObject, this.b, (TLRPC.Document) obj, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                return;
            default:
                hl.c3(new te((u7b) obj4, tLObject, this.d, (ArrayList) obj2, (boolean[]) obj3, this.b));
                return;
        }
    }

    public eu0(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public eu0(c51 c51Var, nx0[] nx0VarArr, vnb vnbVar, int i, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = (byte) 11;
        this.c = c51Var;
        this.d = nx0VarArr;
        this.e = vnbVar;
        this.b = i;
        this.f = tL_messages_checkChatInvite;
    }

    public eu0(u7b u7bVar, Object obj, ArrayList arrayList, boolean[] zArr, int i) {
        this.a = (byte) 14;
        this.c = u7bVar;
        this.d = obj;
        this.e = arrayList;
        this.f = zArr;
        this.b = i;
    }

    public eu0(KeyEvent.Callback callback, Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = callback;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.f = obj3;
    }

    public eu0(Object obj, int i, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public eu0(LaunchActivity launchActivity, int i, id idVar, tg5 tg5Var, String str) {
        this.a = (byte) 7;
        this.c = launchActivity;
        this.b = i;
        this.e = idVar;
        this.f = tg5Var;
        this.d = str;
    }

    public eu0(LaunchActivity launchActivity, Object obj, Object obj2, int i, String str, byte b) {
        this.a = b;
        this.c = launchActivity;
        this.e = obj;
        this.f = obj2;
        this.b = i;
        this.d = str;
    }
}
