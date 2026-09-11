package bi;

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
import org.telegram.ui.Components.pg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dj;
import org.telegram.ui.r80;
import org.telegram.ui.ss;
import org.telegram.ui.v60;
import org.telegram.ui.yq;
public final class fa implements RequestDelegate {
    public final int f2990a;
    public final int f2991b;
    public final Object f2992c;
    public final Object d;
    public final Object f2993e;
    public final Object f2994f;

    public fa(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f2990a = i11;
        this.f2991b = i10;
        this.d = obj;
        this.f2993e = obj2;
        this.f2992c = obj3;
        this.f2994f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f2990a;
        Object obj = this.f2993e;
        Object obj2 = this.f2994f;
        Object obj3 = this.f2992c;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ia((ja) obj4, tLObject, this.f2993e, (ArrayList) obj3, (boolean[]) obj2, this.f2991b));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hg.e1((hg.f1) obj4, this.f2991b, (ArrayList) obj3, (a0.i) obj, tL_error, tLObject, (MessagesController) obj2, 0));
                return;
            case 2:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.f2991b, (ChatObject.Call.OnParticipantsLoad) obj, (ArrayList) obj3, (HashSet) obj2, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ia(this.f2991b, 5, (org.telegram.ui.ActionBar.b2) obj4, (Context) obj, (org.telegram.ui.ActionBar.f6) obj3, (v60) obj2, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new hg.e1(tL_error, tLObject, (ArrayList) obj3, this.f2991b, (AtomicInteger) obj4, (ArrayList) obj, (yq) obj2));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ia((pg0) obj4, (Integer[]) obj, this.f2991b, tLObject, (ArrayList) obj3, (TLRPC.PollAnswerVoters) obj2));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new hg.e1((org.telegram.ui.ActionBar.b2) obj4, tLObject, this.f2991b, (TLRPC.Document) obj3, tL_error, this.f2993e, (TLRPC.TL_stickers_addStickerToSet) obj2));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ia((ss) obj4, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, tLObject, (TLRPC.FileLocation) obj2, this.f2991b));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new hg.e1((org.telegram.ui.ActionBar.b2) obj4, (of.e) obj, tLObject, this.f2991b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, tL_error));
                return;
            case 9:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new hg.e1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (r80) obj3, this.f2991b, (String) obj2));
                return;
            case 10:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new hg.e1((LaunchActivity) obj4, tL_error, tLObject, this.f2991b, (org.telegram.ui.ActionBar.b2) obj, (r80) obj3, (String) obj2));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new hg.e1((org.telegram.ui.web.d1) obj4, (String) obj, tLObject, tL_error, this.f2991b, (org.telegram.ui.web.z0) obj3, (k9) obj2));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ia(this.f2991b, 13, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj, (dj) obj3, (org.telegram.ui.ActionBar.d5) obj2, tLObject));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new zh.o6((di.d) obj4, (org.telegram.ui.ActionBar.f3[]) obj, this.f2991b, (TLObject) obj3, (String) obj2, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ia((di.d) obj4, tLObject, (org.telegram.ui.ActionBar.f3[]) obj, (org.telegram.ui.ActionBar.f6) obj3, this.f2991b, (TLRPC.TL_messages_checkChatInvite) obj2, 14));
                return;
        }
    }

    public fa(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f2990a = i11;
        this.d = callback;
        this.f2993e = obj;
        this.f2991b = i10;
        this.f2992c = obj2;
        this.f2994f = obj3;
    }

    public fa(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f2990a = i11;
        this.d = callback;
        this.f2993e = obj;
        this.f2992c = obj2;
        this.f2991b = i10;
        this.f2994f = obj3;
    }

    public fa(Object obj, int i10, Object obj2, Object obj3, Serializable serializable, int i11) {
        this.f2990a = i11;
        this.d = obj;
        this.f2991b = i10;
        this.f2993e = obj2;
        this.f2992c = obj3;
        this.f2994f = serializable;
    }

    public fa(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f2990a = i11;
        this.d = obj;
        this.f2991b = i10;
        this.f2992c = obj2;
        this.f2993e = obj3;
        this.f2994f = obj4;
    }

    public fa(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f2990a = i11;
        this.d = obj;
        this.f2993e = obj2;
        this.f2992c = obj3;
        this.f2994f = obj4;
        this.f2991b = i10;
    }

    public fa(ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, yq yqVar) {
        this.f2990a = 4;
        this.f2992c = arrayList;
        this.f2991b = i10;
        this.d = atomicInteger;
        this.f2993e = arrayList2;
        this.f2994f = yqVar;
    }
}
