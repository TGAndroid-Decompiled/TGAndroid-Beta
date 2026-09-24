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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aj;
import org.telegram.ui.m80;
import org.telegram.ui.ms;
import org.telegram.ui.p60;
import org.telegram.ui.sq;
public final class ya implements RequestDelegate {
    public final int f1763a;
    public final int f1764b;
    public final Object f1765c;
    public final Object d;
    public final Object e;
    public final Object f1766f;

    public ya(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f1763a = i11;
        this.f1764b = i10;
        this.d = obj;
        this.e = obj2;
        this.f1765c = obj3;
        this.f1766f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f1763a;
        Object obj = this.e;
        Object obj2 = this.f1766f;
        Object obj3 = this.f1765c;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new cb((db) obj4, tLObject, this.e, (ArrayList) obj3, (boolean[]) obj2, this.f1764b));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.e1((gg.f1) obj4, this.f1764b, (ArrayList) obj3, (a0.i) obj, tL_error, tLObject, (MessagesController) obj2, 0));
                return;
            case 2:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.f1764b, (ChatObject.Call.OnParticipantsLoad) obj, (ArrayList) obj3, (HashSet) obj2, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new cb(this.f1764b, 5, (org.telegram.ui.ActionBar.a2) obj4, (Context) obj, (org.telegram.ui.ActionBar.d6) obj3, (p60) obj2, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new gg.e1(tL_error, tLObject, (ArrayList) obj3, this.f1764b, (AtomicInteger) obj4, (ArrayList) obj, (sq) obj2));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new cb((ah0) obj4, (Integer[]) obj, this.f1764b, tLObject, (ArrayList) obj3, (TLRPC.PollAnswerVoters) obj2));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.ActionBar.a2) obj4, tLObject, this.f1764b, (TLRPC.Document) obj3, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj2));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new cb((ms) obj4, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, tLObject, (TLRPC.FileLocation) obj2, this.f1764b));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.ActionBar.a2) obj4, (nf.e) obj, tLObject, this.f1764b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, tL_error));
                return;
            case 9:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new gg.e1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (m80) obj3, this.f1764b, (String) obj2));
                return;
            case 10:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new gg.e1((LaunchActivity) obj4, tL_error, tLObject, this.f1764b, (org.telegram.ui.ActionBar.a2) obj, (m80) obj3, (String) obj2));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.web.b1) obj4, (String) obj, tLObject, tL_error, this.f1764b, (org.telegram.ui.web.y0) obj3, (da) obj2));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new cb(this.f1764b, 13, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj, (aj) obj3, (org.telegram.ui.ActionBar.b5) obj2, tLObject));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new xh.o0((ci.d) obj4, (org.telegram.ui.ActionBar.e3[]) obj, this.f1764b, (TLObject) obj3, (String) obj2, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new cb((ci.d) obj4, tLObject, (org.telegram.ui.ActionBar.e3[]) obj, (org.telegram.ui.ActionBar.d6) obj3, this.f1764b, (TLRPC.TL_messages_checkChatInvite) obj2, 14));
                return;
        }
    }

    public ya(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1763a = i11;
        this.d = callback;
        this.e = obj;
        this.f1764b = i10;
        this.f1765c = obj2;
        this.f1766f = obj3;
    }

    public ya(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f1763a = i11;
        this.d = callback;
        this.e = obj;
        this.f1765c = obj2;
        this.f1764b = i10;
        this.f1766f = obj3;
    }

    public ya(Object obj, int i10, Object obj2, Object obj3, Serializable serializable, int i11) {
        this.f1763a = i11;
        this.d = obj;
        this.f1764b = i10;
        this.e = obj2;
        this.f1765c = obj3;
        this.f1766f = serializable;
    }

    public ya(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f1763a = i11;
        this.d = obj;
        this.f1764b = i10;
        this.f1765c = obj2;
        this.e = obj3;
        this.f1766f = obj4;
    }

    public ya(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f1763a = i11;
        this.d = obj;
        this.e = obj2;
        this.f1765c = obj3;
        this.f1766f = obj4;
        this.f1764b = i10;
    }

    public ya(ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, sq sqVar) {
        this.f1763a = 4;
        this.f1765c = arrayList;
        this.f1764b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f1766f = sqVar;
    }
}
