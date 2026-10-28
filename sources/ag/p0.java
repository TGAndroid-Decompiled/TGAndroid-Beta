package ag;

import android.content.Context;
import android.view.KeyEvent;
import bi.sb;
import di.t8;
import di.x7;
import ig.d1;
import ig.e1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.j60;
import org.telegram.ui.kz;
import org.telegram.ui.ls;
import org.telegram.ui.pq;
import org.telegram.ui.xi;
public final class p0 implements RequestDelegate {
    public final int f1364a;
    public final int f1365b;
    public final Object f1366c;
    public final Object d;
    public final Object e;
    public final Object f1367f;

    public p0(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f1364a = i11;
        this.f1365b = i10;
        this.f1366c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1367f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f1364a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f1367f;
        Object obj4 = this.f1366c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new q0(tLObject, this.f1365b, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (xi) obj, (j5) obj3, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new q0((fi.d) obj4, tLObject, (k3[]) obj2, (u6) obj, this.f1365b, (TLRPC.TL_messages_checkChatInvite) obj3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new sb((fi.d) obj4, (k3[]) obj2, this.f1365b, (TLObject) obj, (String) obj3, 0));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new q0((t8) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.f1365b));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new d1((e1) obj4, this.f1365b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (MessagesController) obj3, 0));
                return;
            case 5:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.f1365b, (ChatObject.Call.OnParticipantsLoad) obj2, (ArrayList) obj, (HashSet) obj3, tLObject, tL_error);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new q0(tLObject, this.f1365b, (e2) obj4, (Context) obj2, (u6) obj, (j60) obj3, 8));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new d1(tL_error, tLObject, (ArrayList) obj4, this.f1365b, (AtomicInteger) obj2, (ArrayList) obj, (pq) obj3));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new q0((oh0) obj4, (Integer[]) obj2, this.f1365b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new d1((e2) obj4, tLObject, this.f1365b, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new q0((ls) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.f1365b));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new d1((e2) obj4, (qf.c) obj2, tLObject, this.f1365b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error));
                return;
            case 12:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new d1((LaunchActivity) obj4, tLObject, (qf.c) obj2, tL_error, (MessagesController) obj, this.f1365b, (String) obj3));
                return;
            case 13:
                Pattern pattern2 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new d1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (kz) obj, this.f1365b, (String) obj3));
                return;
            case 14:
                Pattern pattern3 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new d1((LaunchActivity) obj4, tL_error, tLObject, this.f1365b, (e2) obj2, (kz) obj, (String) obj3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new d1((org.telegram.ui.web.a1) obj4, (String) obj2, tLObject, tL_error, this.f1365b, (org.telegram.ui.web.x0) obj, (x7) obj3));
                return;
        }
    }

    public p0(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1364a = i11;
        this.f1366c = callback;
        this.d = obj;
        this.f1365b = i10;
        this.e = obj2;
        this.f1367f = obj3;
    }

    public p0(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f1364a = i11;
        this.f1366c = callback;
        this.d = obj;
        this.e = obj2;
        this.f1365b = i10;
        this.f1367f = obj3;
    }

    public p0(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f1364a = i11;
        this.f1366c = obj;
        this.f1365b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f1367f = obj4;
    }

    public p0(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f1364a = i11;
        this.f1366c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1367f = obj4;
        this.f1365b = i10;
    }
}
