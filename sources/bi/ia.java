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
import org.telegram.ui.Components.qh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.br;
import org.telegram.ui.d20;
import org.telegram.ui.gj;
import org.telegram.ui.ws;
import org.telegram.ui.z60;
public final class ia implements RequestDelegate {
    public final int f3190a;
    public final int f3191b;
    public final Object f3192c;
    public final Object d;
    public final Object e;
    public final Object f3193f;

    public ia(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f3190a = i11;
        this.f3191b = i10;
        this.d = obj;
        this.e = obj2;
        this.f3192c = obj3;
        this.f3193f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f3190a;
        Object obj = this.e;
        Object obj2 = this.f3193f;
        Object obj3 = this.f3192c;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ma((na) obj4, tLObject, this.e, (ArrayList) obj3, (boolean[]) obj2, this.f3191b));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hg.d1((hg.e1) obj4, this.f3191b, (ArrayList) obj3, (a0.h) obj, tL_error, tLObject, (MessagesController) obj2, 0));
                return;
            case 2:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.f3191b, (ChatObject.Call.OnParticipantsLoad) obj, (ArrayList) obj3, (HashSet) obj2, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ma(this.f3191b, 6, (org.telegram.ui.ActionBar.a2) obj4, (Context) obj, (org.telegram.ui.ActionBar.c6) obj3, (z60) obj2, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new hg.d1(tL_error, tLObject, (ArrayList) obj3, this.f3191b, (AtomicInteger) obj4, (ArrayList) obj, (br) obj2));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ma((qh0) obj4, (Integer[]) obj, this.f3191b, tLObject, (ArrayList) obj3, (TLRPC.PollAnswerVoters) obj2));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.ActionBar.a2) obj4, tLObject, this.f3191b, (TLRPC.Document) obj3, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj2));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ma((ws) obj4, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, tLObject, (TLRPC.FileLocation) obj2, this.f3191b));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.ActionBar.a2) obj4, (pf.c) obj, tLObject, this.f3191b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, tL_error));
                return;
            case 9:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new hg.d1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (d20) obj3, this.f3191b, (String) obj2));
                return;
            case 10:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new hg.d1((LaunchActivity) obj4, tL_error, tLObject, this.f3191b, (org.telegram.ui.ActionBar.a2) obj, (d20) obj3, (String) obj2));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.web.c1) obj4, (String) obj, tLObject, tL_error, this.f3191b, (org.telegram.ui.web.z0) obj3, (n9) obj2));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ma(this.f3191b, 14, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj, (gj) obj3, (org.telegram.ui.ActionBar.b5) obj2, tLObject));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new rg.g2((di.d) obj4, (org.telegram.ui.ActionBar.e3[]) obj, this.f3191b, (TLObject) obj3, (String) obj2, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ma((di.d) obj4, tLObject, (org.telegram.ui.ActionBar.e3[]) obj, (org.telegram.ui.ActionBar.c6) obj3, this.f3191b, (TLRPC.TL_messages_checkChatInvite) obj2, 15));
                return;
        }
    }

    public ia(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f3190a = i11;
        this.d = callback;
        this.e = obj;
        this.f3191b = i10;
        this.f3192c = obj2;
        this.f3193f = obj3;
    }

    public ia(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f3190a = i11;
        this.d = callback;
        this.e = obj;
        this.f3192c = obj2;
        this.f3191b = i10;
        this.f3193f = obj3;
    }

    public ia(Object obj, int i10, Object obj2, Object obj3, Serializable serializable, int i11) {
        this.f3190a = i11;
        this.d = obj;
        this.f3191b = i10;
        this.e = obj2;
        this.f3192c = obj3;
        this.f3193f = serializable;
    }

    public ia(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f3190a = i11;
        this.d = obj;
        this.f3191b = i10;
        this.f3192c = obj2;
        this.e = obj3;
        this.f3193f = obj4;
    }

    public ia(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f3190a = i11;
        this.d = obj;
        this.e = obj2;
        this.f3192c = obj3;
        this.f3193f = obj4;
        this.f3191b = i10;
    }

    public ia(ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, br brVar) {
        this.f3190a = 4;
        this.f3192c = arrayList;
        this.f3191b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f3193f = brVar;
    }
}
