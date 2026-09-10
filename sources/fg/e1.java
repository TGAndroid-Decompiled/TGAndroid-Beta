package fg;

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
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fj;
import org.telegram.ui.h90;
import org.telegram.ui.ts;
import org.telegram.ui.u60;
import org.telegram.ui.zq;
import xh.r6;
public final class e1 implements RequestDelegate {
    public final int f8003a;
    public final int f8004b;
    public final Object f8005c;
    public final Object d;
    public final Object e;
    public final Object f8006f;

    public e1(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f8003a = i11;
        this.f8004b = i10;
        this.d = obj;
        this.f8005c = obj2;
        this.e = obj3;
        this.f8006f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f8003a;
        Object obj = this.e;
        Object obj2 = this.f8006f;
        Object obj3 = this.f8005c;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new f1((g1) obj4, this.f8004b, (ArrayList) obj3, (a0.i) obj, tL_error, tLObject, (MessagesController) obj2, 0));
                return;
            case 1:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.f8004b, (ChatObject.Call.OnParticipantsLoad) obj, (ArrayList) obj3, (HashSet) obj2, tLObject, tL_error);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0(this.f8004b, 4, (org.telegram.ui.ActionBar.d2) obj4, (Context) obj3, (f6) obj, (u60) obj2, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new f1(tL_error, tLObject, (ArrayList) obj3, this.f8004b, (AtomicInteger) obj4, (ArrayList) obj, (zq) obj2));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0((zg0) obj4, (Integer[]) obj, this.f8004b, tLObject, (ArrayList) obj3, (TLRPC.PollAnswerVoters) obj2));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new f1((org.telegram.ui.ActionBar.d2) obj4, tLObject, this.f8004b, (TLRPC.Document) obj3, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj2));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0((ts) obj4, (TLRPC.FileLocation) obj3, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj2, this.f8004b));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new f1((org.telegram.ui.ActionBar.d2) obj4, (nf.e) obj3, tLObject, this.f8004b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj2, tL_error));
                return;
            case 8:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new f1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj3, (h90) obj, this.f8004b, (String) obj2));
                return;
            case 9:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new f1((LaunchActivity) obj4, tL_error, tLObject, this.f8004b, (org.telegram.ui.ActionBar.d2) obj3, (h90) obj, (String) obj2));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new f1((org.telegram.ui.web.c1) obj4, (String) obj3, tLObject, tL_error, this.f8004b, (org.telegram.ui.web.y0) obj, (org.telegram.ui.web.a1) obj2));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0(this.f8004b, 12, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj3, (fj) obj, (f5) obj2, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new r6((bi.d) obj4, (h3[]) obj3, this.f8004b, (TLObject) obj, (String) obj2, 0));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0((bi.d) obj4, tLObject, (h3[]) obj3, (f6) obj, this.f8004b, (TLRPC.TL_messages_checkChatInvite) obj2, 13));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0((zh.r6) obj4, tLObject, this.e, (ArrayList) obj3, (boolean[]) obj2, this.f8004b));
                return;
        }
    }

    public e1(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f8003a = i11;
        this.d = callback;
        this.f8005c = obj;
        this.e = obj2;
        this.f8004b = i10;
        this.f8006f = obj3;
    }

    public e1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f8003a = i11;
        this.d = obj;
        this.f8004b = i10;
        this.f8005c = obj2;
        this.e = obj3;
        this.f8006f = obj4;
    }

    public e1(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f8003a = i11;
        this.d = obj;
        this.f8005c = obj2;
        this.f8004b = i10;
        this.e = obj3;
        this.f8006f = obj4;
    }

    public e1(ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, zq zqVar) {
        this.f8003a = 3;
        this.f8005c = arrayList;
        this.f8004b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f8006f = zqVar;
    }

    public e1(ChatObject.Call call, int i10, ChatObject.Call.OnParticipantsLoad onParticipantsLoad, ArrayList arrayList, HashSet hashSet) {
        this.f8003a = 1;
        this.d = call;
        this.f8004b = i10;
        this.e = onParticipantsLoad;
        this.f8005c = arrayList;
        this.f8006f = hashSet;
    }

    public e1(zg0 zg0Var, Integer[] numArr, int i10, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f8003a = 4;
        this.d = zg0Var;
        this.e = numArr;
        this.f8004b = i10;
        this.f8005c = arrayList;
        this.f8006f = pollAnswerVoters;
    }

    public e1(ts tsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLRPC.FileLocation fileLocation2, int i10) {
        this.f8003a = 6;
        this.d = tsVar;
        this.f8005c = fileLocation;
        this.e = inputFile;
        this.f8006f = fileLocation2;
        this.f8004b = i10;
    }

    public e1(zh.r6 r6Var, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f8003a = 14;
        this.d = r6Var;
        this.e = obj;
        this.f8005c = arrayList;
        this.f8006f = zArr;
        this.f8004b = i10;
    }
}
