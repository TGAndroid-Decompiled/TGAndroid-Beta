package ai;

import android.content.Context;
import android.view.KeyEvent;
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
import org.telegram.ui.Components.nh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f60;
import org.telegram.ui.f80;
import org.telegram.ui.hs;
import org.telegram.ui.lq;
import org.telegram.ui.ti;
public final class tb implements RequestDelegate {
    public final int f2226a;
    public final Object f2227b;
    public final Object f2228c;
    public final int d;
    public final Object e;
    public final Object f2229f;

    public tb(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f2226a = i11;
        this.d = i10;
        this.f2227b = obj;
        this.f2228c = obj2;
        this.e = obj3;
        this.f2229f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f2226a;
        Object obj = this.e;
        Object obj2 = this.f2228c;
        Object obj3 = this.f2229f;
        Object obj4 = this.f2227b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new vb((ei.d) obj4, (org.telegram.ui.ActionBar.h3[]) obj2, this.d, (TLObject) obj, (String) obj3, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wb((ei.d) obj4, tLObject, (org.telegram.ui.ActionBar.h3[]) obj2, (org.telegram.ui.ActionBar.g6) obj, this.d, (TLRPC.TL_messages_checkChatInvite) obj3, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new wb((ci.u8) obj4, tLObject, this.f2228c, (ArrayList) obj, (boolean[]) obj3, this.d, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new hg.d1((hg.e1) obj4, this.d, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (MessagesController) obj3, 0));
                return;
            case 4:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.d, (ChatObject.Call.OnParticipantsLoad) obj2, (ArrayList) obj, (HashSet) obj3, tLObject, tL_error);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new wb(this.d, 7, (org.telegram.ui.ActionBar.c2) obj4, (Context) obj2, (org.telegram.ui.ActionBar.g6) obj, (f60) obj3, tLObject));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new hg.d1(tL_error, tLObject, (ArrayList) obj4, this.d, (AtomicInteger) obj2, (ArrayList) obj, (lq) obj3));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new wb((nh0) obj4, (Integer[]) obj2, this.d, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.ActionBar.c2) obj4, tLObject, this.d, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new wb((hs) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.d));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.ActionBar.c2) obj4, (pf.c) obj2, tLObject, this.d, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error));
                return;
            case 11:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new hg.d1((LaunchActivity) obj4, tLObject, (pf.c) obj2, tL_error, (MessagesController) obj, this.d, (String) obj3));
                return;
            case 12:
                Pattern pattern2 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new hg.d1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (f80) obj, this.d, (String) obj3));
                return;
            case 13:
                Pattern pattern3 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new hg.d1((LaunchActivity) obj4, tL_error, tLObject, this.d, (org.telegram.ui.ActionBar.c2) obj2, (f80) obj, (String) obj3));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.web.b1) obj4, (String) obj3, tLObject, tL_error, this.d, (org.telegram.ui.web.y0) obj2, (ci.y7) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wb(this.d, 15, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (ti) obj, (org.telegram.ui.ActionBar.h5) obj3, tLObject));
                return;
        }
    }

    public tb(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f2226a = i11;
        this.f2227b = callback;
        this.f2228c = obj;
        this.d = i10;
        this.e = obj2;
        this.f2229f = obj3;
    }

    public tb(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f2226a = i11;
        this.f2227b = callback;
        this.f2228c = obj;
        this.e = obj2;
        this.d = i10;
        this.f2229f = obj3;
    }

    public tb(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f2226a = i11;
        this.f2227b = obj;
        this.d = i10;
        this.f2228c = obj2;
        this.e = obj3;
        this.f2229f = obj4;
    }

    public tb(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f2226a = i11;
        this.f2227b = obj;
        this.f2228c = obj2;
        this.e = obj3;
        this.f2229f = obj4;
        this.d = i10;
    }

    public tb(org.telegram.ui.web.b1 b1Var, String str, int i10, org.telegram.ui.web.y0 y0Var, ci.y7 y7Var) {
        this.f2226a = 14;
        this.f2227b = b1Var;
        this.f2229f = str;
        this.d = i10;
        this.f2228c = y0Var;
        this.e = y7Var;
    }
}
