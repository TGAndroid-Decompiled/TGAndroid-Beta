package kf;

import android.content.Context;
import android.view.KeyEvent;
import dg.f3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import kh.l2;
import nh.d8;
import nh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bj;
import org.telegram.ui.ps;
import org.telegram.ui.q60;
import org.telegram.ui.tq;
import org.telegram.ui.w10;
import org.telegram.ui.web.c1;
import org.telegram.ui.web.y0;
public final class i0 implements RequestDelegate {
    public final int f10463a;
    public final int f10464b;
    public final Object f10465c;
    public final Object d;
    public final Object e;
    public final Object f10466f;

    public i0(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f10463a = i11;
        this.f10464b = i10;
        this.f10465c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f10466f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f10463a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f10466f;
        Object obj4 = this.f10465c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new j0(tLObject, this.f10464b, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (bj) obj, (e5) obj3, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3((ph.d) obj4, (g3[]) obj2, this.f10464b, (TLObject) obj, (String) obj3, 2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new j0((ph.d) obj4, tLObject, (g3[]) obj2, (f6) obj, this.f10464b, (TLRPC.TL_messages_checkChatInvite) obj3));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new j0((d8) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.f10464b));
                return;
            case 4:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.f10464b, (ChatObject.Call.OnParticipantsLoad) obj2, (ArrayList) obj, (HashSet) obj3, tLObject, tL_error);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new j0(tLObject, this.f10464b, (d2) obj4, (Context) obj2, (f6) obj, (q60) obj3, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new l2(tL_error, tLObject, (ArrayList) obj4, this.f10464b, (AtomicInteger) obj2, (ArrayList) obj, (tq) obj3, 6));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new j0((wg0) obj4, (Integer[]) obj2, this.f10464b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new l2((d2) obj4, tLObject, this.f10464b, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new j0((ps) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.f10464b));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new l2((d2) obj4, (ze.c) obj2, tLObject, this.f10464b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error, 8));
                return;
            case 11:
                Pattern pattern = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new l2((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (w10) obj, this.f10464b, (String) obj3, 10));
                return;
            case 12:
                Pattern pattern2 = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new l2((LaunchActivity) obj4, tL_error, tLObject, this.f10464b, (d2) obj2, (w10) obj, (String) obj3));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new l2((c1) obj4, (String) obj2, tLObject, tL_error, this.f10464b, (y0) obj, (j7) obj3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l2((tf.p0) obj4, this.f10464b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (MessagesController) obj3, 15));
                return;
        }
    }

    public i0(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f10463a = i11;
        this.f10465c = callback;
        this.d = obj;
        this.f10464b = i10;
        this.e = obj2;
        this.f10466f = obj3;
    }

    public i0(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f10463a = i11;
        this.f10465c = callback;
        this.d = obj;
        this.e = obj2;
        this.f10464b = i10;
        this.f10466f = obj3;
    }

    public i0(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f10463a = i11;
        this.f10465c = obj;
        this.f10464b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f10466f = obj4;
    }

    public i0(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f10463a = i11;
        this.f10465c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f10466f = obj4;
        this.f10464b = i10;
    }
}
