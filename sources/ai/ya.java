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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bj;
import org.telegram.ui.h90;
import org.telegram.ui.qs;
import org.telegram.ui.t60;
import org.telegram.ui.uq;
public final class ya implements RequestDelegate {
    public final int f1917a;
    public final int f1918b;
    public final Object f1919c;
    public final Object d;
    public final Object f1920e;
    public final Object f1921f;

    public ya(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f1917a = i11;
        this.f1918b = i10;
        this.d = obj;
        this.f1920e = obj2;
        this.f1919c = obj3;
        this.f1921f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f1917a;
        Object obj = this.f1920e;
        Object obj2 = this.f1921f;
        Object obj3 = this.f1919c;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new cb((db) obj4, tLObject, this.f1920e, (ArrayList) obj3, (boolean[]) obj2, this.f1918b));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.e1((gg.f1) obj4, this.f1918b, (ArrayList) obj3, (a0.i) obj, tL_error, tLObject, (MessagesController) obj2, 0));
                return;
            case 2:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.f1918b, (ChatObject.Call.OnParticipantsLoad) obj, (ArrayList) obj3, (HashSet) obj2, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new cb(this.f1918b, 5, (org.telegram.ui.ActionBar.b2) obj4, (Context) obj, (org.telegram.ui.ActionBar.d6) obj3, (t60) obj2, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new gg.e1(tL_error, tLObject, (ArrayList) obj3, this.f1918b, (AtomicInteger) obj4, (ArrayList) obj, (uq) obj2));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new cb((ch0) obj4, (Integer[]) obj, this.f1918b, tLObject, (ArrayList) obj3, (TLRPC.PollAnswerVoters) obj2));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.ActionBar.b2) obj4, tLObject, this.f1918b, (TLRPC.Document) obj3, tL_error, this.f1920e, (TLRPC.TL_stickers_addStickerToSet) obj2));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new cb((qs) obj4, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, tLObject, (TLRPC.FileLocation) obj2, this.f1918b));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.ActionBar.b2) obj4, (nf.e) obj, tLObject, this.f1918b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, tL_error));
                return;
            case 9:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new gg.e1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (h90) obj3, this.f1918b, (String) obj2));
                return;
            case 10:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new gg.e1((LaunchActivity) obj4, tL_error, tLObject, this.f1918b, (org.telegram.ui.ActionBar.b2) obj, (h90) obj3, (String) obj2));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.web.c1) obj4, (String) obj, tLObject, tL_error, this.f1918b, (org.telegram.ui.web.z0) obj3, (da) obj2));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new cb(this.f1918b, 13, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj, (bj) obj3, (org.telegram.ui.ActionBar.c5) obj2, tLObject));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new cb((ci.d) obj4, tLObject, (org.telegram.ui.ActionBar.f3[]) obj, (org.telegram.ui.ActionBar.d6) obj3, this.f1918b, (TLRPC.TL_messages_checkChatInvite) obj2, 14));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xh.o0((ci.d) obj4, (org.telegram.ui.ActionBar.f3[]) obj, this.f1918b, (TLObject) obj3, (String) obj2, 1));
                return;
        }
    }

    public ya(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1917a = i11;
        this.d = callback;
        this.f1920e = obj;
        this.f1918b = i10;
        this.f1919c = obj2;
        this.f1921f = obj3;
    }

    public ya(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f1917a = i11;
        this.d = callback;
        this.f1920e = obj;
        this.f1919c = obj2;
        this.f1918b = i10;
        this.f1921f = obj3;
    }

    public ya(Object obj, int i10, Object obj2, Object obj3, Serializable serializable, int i11) {
        this.f1917a = i11;
        this.d = obj;
        this.f1918b = i10;
        this.f1920e = obj2;
        this.f1919c = obj3;
        this.f1921f = serializable;
    }

    public ya(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f1917a = i11;
        this.d = obj;
        this.f1918b = i10;
        this.f1919c = obj2;
        this.f1920e = obj3;
        this.f1921f = obj4;
    }

    public ya(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f1917a = i11;
        this.d = obj;
        this.f1920e = obj2;
        this.f1919c = obj3;
        this.f1921f = obj4;
        this.f1918b = i10;
    }

    public ya(ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, uq uqVar) {
        this.f1917a = 4;
        this.f1919c = arrayList;
        this.f1918b = i10;
        this.d = atomicInteger;
        this.f1920e = arrayList2;
        this.f1921f = uqVar;
    }
}
