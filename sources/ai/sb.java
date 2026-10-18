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
import org.telegram.ui.Components.kh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b80;
import org.telegram.ui.d60;
import org.telegram.ui.hs;
import org.telegram.ui.lq;
import org.telegram.ui.vi;
public final class sb implements RequestDelegate {
    public final int f2178a;
    public final Object f2179b;
    public final Object f2180c;
    public final int d;
    public final Object e;
    public final Object f2181f;

    public sb(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f2178a = i11;
        this.d = i10;
        this.f2179b = obj;
        this.f2180c = obj2;
        this.e = obj3;
        this.f2181f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f2178a;
        Object obj = this.e;
        Object obj2 = this.f2180c;
        Object obj3 = this.f2181f;
        Object obj4 = this.f2179b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ub((ei.d) obj4, (org.telegram.ui.ActionBar.f3[]) obj2, this.d, (TLObject) obj, (String) obj3, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new vb((ei.d) obj4, tLObject, (org.telegram.ui.ActionBar.f3[]) obj2, (org.telegram.ui.ActionBar.d6) obj, this.d, (TLRPC.TL_messages_checkChatInvite) obj3, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new vb((ci.v8) obj4, tLObject, this.f2180c, (ArrayList) obj, (boolean[]) obj3, this.d, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new hg.d1((hg.e1) obj4, this.d, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (MessagesController) obj3, 0));
                return;
            case 4:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.d, (ChatObject.Call.OnParticipantsLoad) obj2, (ArrayList) obj, (HashSet) obj3, tLObject, tL_error);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new vb(this.d, 7, (org.telegram.ui.ActionBar.b2) obj4, (Context) obj2, (org.telegram.ui.ActionBar.d6) obj, (d60) obj3, tLObject));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new hg.d1(tL_error, tLObject, (ArrayList) obj4, this.d, (AtomicInteger) obj2, (ArrayList) obj, (lq) obj3));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new vb((kh0) obj4, (Integer[]) obj2, this.d, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.ActionBar.b2) obj4, tLObject, this.d, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new vb((hs) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.d));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.ActionBar.b2) obj4, (pf.c) obj2, tLObject, this.d, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error));
                return;
            case 11:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new hg.d1((LaunchActivity) obj4, tLObject, (pf.c) obj2, tL_error, (MessagesController) obj, this.d, (String) obj3));
                return;
            case 12:
                Pattern pattern2 = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new hg.d1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (b80) obj, this.d, (String) obj3));
                return;
            case 13:
                Pattern pattern3 = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new hg.d1((LaunchActivity) obj4, tL_error, tLObject, this.d, (org.telegram.ui.ActionBar.b2) obj2, (b80) obj, (String) obj3));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.web.a1) obj4, (String) obj3, tLObject, tL_error, this.d, (org.telegram.ui.web.x0) obj2, (ci.z7) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vb(this.d, 15, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (vi) obj, (org.telegram.ui.ActionBar.d5) obj3, tLObject));
                return;
        }
    }

    public sb(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f2178a = i11;
        this.f2179b = callback;
        this.f2180c = obj;
        this.d = i10;
        this.e = obj2;
        this.f2181f = obj3;
    }

    public sb(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f2178a = i11;
        this.f2179b = callback;
        this.f2180c = obj;
        this.e = obj2;
        this.d = i10;
        this.f2181f = obj3;
    }

    public sb(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f2178a = i11;
        this.f2179b = obj;
        this.d = i10;
        this.f2180c = obj2;
        this.e = obj3;
        this.f2181f = obj4;
    }

    public sb(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f2178a = i11;
        this.f2179b = obj;
        this.f2180c = obj2;
        this.e = obj3;
        this.f2181f = obj4;
        this.d = i10;
    }

    public sb(org.telegram.ui.web.a1 a1Var, String str, int i10, org.telegram.ui.web.x0 x0Var, ci.z7 z7Var) {
        this.f2178a = 14;
        this.f2179b = a1Var;
        this.f2181f = str;
        this.d = i10;
        this.f2180c = x0Var;
        this.e = z7Var;
    }
}
