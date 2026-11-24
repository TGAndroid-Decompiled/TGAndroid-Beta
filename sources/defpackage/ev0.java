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
public final class ev0 implements RequestDelegate {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public ev0(b61 b61Var, my0[] my0VarArr, int i, TLObject tLObject, String str) {
        this.a = (byte) 12;
        this.c = b61Var;
        this.e = my0VarArr;
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
                gm.c3(new qu((qw0) obj4, (String) obj, tLObject, tL_error, this.b, (mw0) obj2, (ow0) obj3));
                return;
            case 1:
                gm.c3(new jg(tLObject, this.b, (he) obj4, (Context) obj, (ylb) obj2, (dc5) obj3));
                return;
            case 2:
                gm.c3(new jg((qd2) obj4, this.b, tLObject, (pt0) obj, (ArrayList) obj2, (HashSet) obj3, (byte) 5));
                return;
            case 3:
                gm.c3(new qu(tL_error, tLObject, (ArrayList) obj4, this.b, (AtomicInteger) obj, (ArrayList) obj2, (co1) obj3));
                return;
            case 4:
                gm.c3(new qu((he) obj4, (k11) obj, tLObject, this.b, (Activity) obj2, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error));
                return;
            case 5:
                String str = LaunchActivity.C1;
                gm.c3(new qu((LaunchActivity) obj4, tLObject, (k11) obj2, tL_error, (oc7) obj3, this.b, (String) obj, (byte) 10));
                return;
            case 6:
                String str2 = LaunchActivity.C1;
                gm.c3(new qu((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (k16) obj3, this.b, (String) obj));
                return;
            case 7:
                String str3 = LaunchActivity.C1;
                gm.c3(new qu((LaunchActivity) obj4, tL_error, tLObject, this.b, (he) obj2, (k16) obj3, (String) obj));
                return;
            case 8:
                gm.c3(new qu((g17) obj4, this.b, (ArrayList) obj, (vh6) obj2, tL_error, tLObject, (oc7) obj3));
                return;
            case 9:
                gm.c3(new jg(tLObject, this.b, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj, (au1) obj2, (tk5) obj3, (byte) 8));
                return;
            case 10:
                gm.c3(new jg((ih8) obj4, (Integer[]) obj, this.b, tLObject, (ArrayList) obj2, (TLRPC.PollAnswerVoters) obj3, (byte) 9));
                return;
            case 11:
                gm.c3(new jg((b61) obj4, tLObject, (my0[]) obj, (ylb) obj2, this.b, (TLRPC.TL_messages_checkChatInvite) obj3));
                return;
            case 12:
                gm.c3(new i77((b61) obj4, (my0[]) obj2, this.b, (TLObject) obj3, (String) obj, (byte) 26));
                return;
            case 13:
                gm.c3(new qu((he) obj4, tLObject, this.b, (TLRPC.Document) obj, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                return;
            default:
                gm.c3(new jg((y5b) obj4, tLObject, this.d, (ArrayList) obj2, (boolean[]) obj3, this.b));
                return;
        }
    }

    public ev0(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public ev0(b61 b61Var, my0[] my0VarArr, ylb ylbVar, int i, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = (byte) 11;
        this.c = b61Var;
        this.d = my0VarArr;
        this.e = ylbVar;
        this.b = i;
        this.f = tL_messages_checkChatInvite;
    }

    public ev0(y5b y5bVar, Object obj, ArrayList arrayList, boolean[] zArr, int i) {
        this.a = (byte) 14;
        this.c = y5bVar;
        this.d = obj;
        this.e = arrayList;
        this.f = zArr;
        this.b = i;
    }

    public ev0(KeyEvent.Callback callback, Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = callback;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.f = obj3;
    }

    public ev0(Object obj, int i, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public ev0(LaunchActivity launchActivity, int i, he heVar, k16 k16Var, String str) {
        this.a = (byte) 7;
        this.c = launchActivity;
        this.b = i;
        this.e = heVar;
        this.f = k16Var;
        this.d = str;
    }

    public ev0(LaunchActivity launchActivity, Object obj, Object obj2, int i, String str, byte b) {
        this.a = b;
        this.c = launchActivity;
        this.e = obj;
        this.f = obj2;
        this.b = i;
        this.d = str;
    }
}
