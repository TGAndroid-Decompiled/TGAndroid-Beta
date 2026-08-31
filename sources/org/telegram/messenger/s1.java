package org.telegram.messenger;

import android.app.Activity;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.hq0;
public final class s1 implements Runnable {
    public final int f19932a = 3;
    public final int f19933b;
    public final Object f19934c;
    public final boolean d;
    public final Object f19935e;
    public final Object f19936f;
    public final Object h;

    public s1(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z4, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f19935e = activity;
        this.f19933b = i10;
        this.f19934c = inputGroupCall;
        this.d = z4;
        this.f19936f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.s1.run():void");
    }

    public s1(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z4) {
        this.f19935e = contactsController;
        this.f19933b = i10;
        this.f19934c = arrayList;
        this.f19936f = arrayList2;
        this.h = hVar;
        this.d = z4;
    }

    public s1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, int i10, SendMessagesHelper.DelayedMessage delayedMessage, ArrayList arrayList, boolean z4) {
        this.f19935e = sendMessagesHelper;
        this.f19936f = tLObject;
        this.f19933b = i10;
        this.h = delayedMessage;
        this.f19934c = arrayList;
        this.d = z4;
    }

    public s1(zv0 zv0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        this.f19935e = zv0Var;
        this.f19934c = tL_messages_stickerSet;
        this.f19933b = i10;
        this.f19936f = messageObject;
        this.h = t1Var;
        this.d = z4;
    }

    public s1(hq0 hq0Var, String str, int i10, TLObject tLObject, boolean z4, TLRPC.User user) {
        this.f19935e = hq0Var;
        this.f19934c = str;
        this.f19933b = i10;
        this.f19936f = tLObject;
        this.d = z4;
        this.h = user;
    }

    public s1(wh.r3 r3Var, Uri uri, boolean z4, String str, int i10, wh.a aVar) {
        this.f19935e = r3Var;
        this.f19934c = uri;
        this.d = z4;
        this.f19936f = str;
        this.f19933b = i10;
        this.h = aVar;
    }
}
