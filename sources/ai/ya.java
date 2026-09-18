package ai;

import android.content.Context;
import android.view.KeyEvent;
import java.io.Serializable;
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
import org.telegram.ui.Components.qg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ej;
import org.telegram.ui.oa0;
import org.telegram.ui.us;
import org.telegram.ui.w60;
import org.telegram.ui.xq;
public final class ya implements RequestDelegate {
    public final int f1769a;
    public final int f1770b;
    public final Object f1771c;
    public final Object d;
    public final Object e;
    public final Object f1772f;

    public ya(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f1769a = i11;
        this.f1770b = i10;
        this.d = obj;
        this.e = obj2;
        this.f1771c = obj3;
        this.f1772f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f1769a;
        Object obj = this.e;
        Object obj2 = this.f1772f;
        Object obj3 = this.f1771c;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new cb((db) obj4, tLObject, this.e, (ArrayList) obj3, (boolean[]) obj2, this.f1770b));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.e1((gg.f1) obj4, this.f1770b, (ArrayList) obj3, (a0.i) obj, tL_error, tLObject, (MessagesController) obj2, 0));
                return;
            case 2:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.f1770b, (ChatObject.Call.OnParticipantsLoad) obj, (ArrayList) obj3, (HashSet) obj2, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new cb(this.f1770b, 5, (org.telegram.ui.ActionBar.c2) obj4, (Context) obj, (org.telegram.ui.ActionBar.f6) obj3, (w60) obj2, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new gg.e1(tL_error, tLObject, (ArrayList) obj3, this.f1770b, (AtomicInteger) obj4, (ArrayList) obj, (xq) obj2));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new cb((qg0) obj4, (Integer[]) obj, this.f1770b, tLObject, (ArrayList) obj3, (TLRPC.PollAnswerVoters) obj2));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.ActionBar.c2) obj4, tLObject, this.f1770b, (TLRPC.Document) obj3, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj2));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new cb((us) obj4, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, tLObject, (TLRPC.FileLocation) obj2, this.f1770b));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.ActionBar.c2) obj4, (nf.e) obj, tLObject, this.f1770b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, tL_error));
                return;
            case 9:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new gg.e1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (oa0) obj3, this.f1770b, (String) obj2));
                return;
            case 10:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new gg.e1((LaunchActivity) obj4, tL_error, tLObject, this.f1770b, (org.telegram.ui.ActionBar.c2) obj, (oa0) obj3, (String) obj2));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.web.d1) obj4, (String) obj, tLObject, tL_error, this.f1770b, (org.telegram.ui.web.z0) obj3, (da) obj2));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new cb(this.f1770b, 13, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj, (ej) obj3, (org.telegram.ui.ActionBar.e5) obj2, tLObject));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new yh.r6((ci.d) obj4, (org.telegram.ui.ActionBar.g3[]) obj, this.f1770b, (TLObject) obj3, (String) obj2, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new cb((ci.d) obj4, tLObject, (org.telegram.ui.ActionBar.g3[]) obj, (org.telegram.ui.ActionBar.f6) obj3, this.f1770b, (TLRPC.TL_messages_checkChatInvite) obj2, 14));
                return;
        }
    }

    public ya(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1769a = i11;
        this.d = callback;
        this.e = obj;
        this.f1770b = i10;
        this.f1771c = obj2;
        this.f1772f = obj3;
    }

    public ya(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f1769a = i11;
        this.d = callback;
        this.e = obj;
        this.f1771c = obj2;
        this.f1770b = i10;
        this.f1772f = obj3;
    }

    public ya(Object obj, int i10, Object obj2, Object obj3, Serializable serializable, int i11) {
        this.f1769a = i11;
        this.d = obj;
        this.f1770b = i10;
        this.e = obj2;
        this.f1771c = obj3;
        this.f1772f = serializable;
    }

    public ya(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f1769a = i11;
        this.d = obj;
        this.f1770b = i10;
        this.f1771c = obj2;
        this.e = obj3;
        this.f1772f = obj4;
    }

    public ya(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f1769a = i11;
        this.d = obj;
        this.e = obj2;
        this.f1771c = obj3;
        this.f1772f = obj4;
        this.f1770b = i10;
    }

    public ya(ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, xq xqVar) {
        this.f1769a = 4;
        this.f1771c = arrayList;
        this.f1770b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f1772f = xqVar;
    }
}
