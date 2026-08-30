package lf;

import android.content.Context;
import android.view.KeyEvent;
import dg.f3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import kh.m2;
import nh.d8;
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
import org.telegram.ui.Components.vg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g00;
import org.telegram.ui.ns;
import org.telegram.ui.o60;
import org.telegram.ui.rq;
import org.telegram.ui.zi;
public final class i0 implements RequestDelegate {
    public final int f12021a;
    public final int f12022b;
    public final Object f12023c;
    public final Object d;
    public final Object e;
    public final Object f12024f;

    public i0(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f12021a = i11;
        this.f12022b = i10;
        this.f12023c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f12024f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f12021a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f12024f;
        Object obj4 = this.f12023c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new j0(tLObject, this.f12022b, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (zi) obj, (e5) obj3, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3((ph.d) obj4, (g3[]) obj2, this.f12022b, (TLObject) obj, (String) obj3, 2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new j0((ph.d) obj4, tLObject, (g3[]) obj2, (f6) obj, this.f12022b, (TLRPC.TL_messages_checkChatInvite) obj3));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new j0((d8) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.f12022b));
                return;
            case 4:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.f12022b, (ChatObject.Call.OnParticipantsLoad) obj2, (ArrayList) obj, (HashSet) obj3, tLObject, tL_error);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new j0(tLObject, this.f12022b, (d2) obj4, (Context) obj2, (f6) obj, (o60) obj3, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new m2(tL_error, tLObject, (ArrayList) obj4, this.f12022b, (AtomicInteger) obj2, (ArrayList) obj, (rq) obj3, 6));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new j0((vg0) obj4, (Integer[]) obj2, this.f12022b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new m2((d2) obj4, tLObject, this.f12022b, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new j0((ns) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.f12022b));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new m2((d2) obj4, (af.f) obj2, tLObject, this.f12022b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error, 8));
                return;
            case 11:
                Pattern pattern = LaunchActivity.f31612y1;
                AndroidUtilities.runOnUIThread(new m2((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (g00) obj, this.f12022b, (String) obj3, 10));
                return;
            case 12:
                Pattern pattern2 = LaunchActivity.f31612y1;
                AndroidUtilities.runOnUIThread(new m2((LaunchActivity) obj4, tL_error, tLObject, this.f12022b, (d2) obj2, (g00) obj, (String) obj3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m2((tf.p0) obj4, this.f12022b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (MessagesController) obj3, 14));
                return;
        }
    }

    public i0(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f12021a = i11;
        this.f12023c = callback;
        this.d = obj;
        this.f12022b = i10;
        this.e = obj2;
        this.f12024f = obj3;
    }

    public i0(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f12021a = i11;
        this.f12023c = callback;
        this.d = obj;
        this.e = obj2;
        this.f12022b = i10;
        this.f12024f = obj3;
    }

    public i0(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f12021a = i11;
        this.f12023c = obj;
        this.f12022b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f12024f = obj4;
    }

    public i0(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f12021a = i11;
        this.f12023c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f12024f = obj4;
        this.f12022b = i10;
    }
}
