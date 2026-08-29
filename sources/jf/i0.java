package jf;

import android.content.Context;
import android.view.KeyEvent;
import bg.j3;
import ih.m2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import lh.d8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c60;
import org.telegram.ui.hs;
import org.telegram.ui.lq;
import org.telegram.ui.ui;
import org.telegram.ui.x60;
public final class i0 implements RequestDelegate {
    public final int f11632a;
    public final int f11633b;
    public final Object f11634c;
    public final Object d;
    public final Object f11635e;
    public final Object f11636f;

    public i0(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f11632a = i11;
        this.f11633b = i10;
        this.f11634c = obj;
        this.d = obj2;
        this.f11635e = obj3;
        this.f11636f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f11632a;
        Object obj = this.f11635e;
        Object obj2 = this.d;
        Object obj3 = this.f11636f;
        Object obj4 = this.f11634c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new j0(tLObject, this.f11633b, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (ui) obj, (b5) obj3, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new j3((nh.d) obj4, (f3[]) obj2, this.f11633b, (TLObject) obj, (String) obj3, 2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new j0((nh.d) obj4, tLObject, (f3[]) obj2, (c6) obj, this.f11633b, (TLRPC.TL_messages_checkChatInvite) obj3));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new j0((d8) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.f11633b));
                return;
            case 4:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.f11633b, (ChatObject.Call.OnParticipantsLoad) obj2, (ArrayList) obj, (HashSet) obj3, tLObject, tL_error);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new j0(tLObject, this.f11633b, (c2) obj4, (Context) obj2, (c6) obj, (c60) obj3, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new m2(tL_error, tLObject, (ArrayList) obj4, this.f11633b, (AtomicInteger) obj2, (ArrayList) obj, (lq) obj3, 6));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new j0((lg0) obj4, (Integer[]) obj2, this.f11633b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new m2((c2) obj4, tLObject, this.f11633b, (TLRPC.Document) obj2, tL_error, this.f11635e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new j0((hs) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.f11633b));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new m2((c2) obj4, (ye.c) obj2, tLObject, this.f11633b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error, 8));
                return;
            case 11:
                Pattern pattern = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new m2((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (x60) obj, this.f11633b, (String) obj3, 10));
                return;
            case 12:
                Pattern pattern2 = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new m2((LaunchActivity) obj4, tL_error, tLObject, this.f11633b, (c2) obj2, (x60) obj, (String) obj3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m2((rf.q0) obj4, this.f11633b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (MessagesController) obj3, 14));
                return;
        }
    }

    public i0(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f11632a = i11;
        this.f11634c = callback;
        this.d = obj;
        this.f11633b = i10;
        this.f11635e = obj2;
        this.f11636f = obj3;
    }

    public i0(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f11632a = i11;
        this.f11634c = callback;
        this.d = obj;
        this.f11635e = obj2;
        this.f11633b = i10;
        this.f11636f = obj3;
    }

    public i0(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f11632a = i11;
        this.f11634c = obj;
        this.f11633b = i10;
        this.d = obj2;
        this.f11635e = obj3;
        this.f11636f = obj4;
    }

    public i0(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f11632a = i11;
        this.f11634c = obj;
        this.d = obj2;
        this.f11635e = obj3;
        this.f11636f = obj4;
        this.f11633b = i10;
    }
}
