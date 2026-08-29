package org.telegram.messenger;

import android.app.Activity;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.zp0;
public final class r1 implements Runnable {
    public final int f21392a = 3;
    public final int f21393b;
    public final Object f21394c;
    public final boolean d;
    public final Object f21395e;
    public final Object f21396f;
    public final Object h;

    public r1(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f21395e = activity;
        this.f21393b = i10;
        this.f21394c = inputGroupCall;
        this.d = z10;
        this.f21396f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.r1.run():void");
    }

    public r1(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.f21395e = contactsController;
        this.f21393b = i10;
        this.f21394c = arrayList;
        this.f21396f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    public r1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, int i10, SendMessagesHelper.DelayedMessage delayedMessage, ArrayList arrayList, boolean z10) {
        this.f21395e = sendMessagesHelper;
        this.f21396f = tLObject;
        this.f21393b = i10;
        this.h = delayedMessage;
        this.f21394c = arrayList;
        this.d = z10;
    }

    public r1(pv0 pv0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        this.f21395e = pv0Var;
        this.f21394c = tL_messages_stickerSet;
        this.f21393b = i10;
        this.f21396f = messageObject;
        this.h = s1Var;
        this.d = z10;
    }

    public r1(zp0 zp0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f21395e = zp0Var;
        this.f21394c = str;
        this.f21393b = i10;
        this.f21396f = tLObject;
        this.d = z10;
        this.h = user;
    }

    public r1(th.p3 p3Var, Uri uri, boolean z10, String str, int i10, th.a aVar) {
        this.f21395e = p3Var;
        this.f21394c = uri;
        this.d = z10;
        this.f21396f = str;
        this.f21393b = i10;
        this.h = aVar;
    }
}
