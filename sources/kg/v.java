package kg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import bg.q1;
import cg.g2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tn;
public final class v extends FrameLayout {
    public final tn f13870a;
    public u f13871b;
    public List f13872c;
    public boolean d;
    public MessageObject f13873e;
    public final int f13874f;
    public final int h;
    public float f13875n;
    public float f13876r;
    public float f13877s;
    public long v;
    public boolean f13878w;
    public boolean f13879x;
    public final int[] f13880y;

    public v(tn tnVar, Context context) {
        super(context);
        this.f13872c = Collections.EMPTY_LIST;
        this.f13874f = 22;
        this.h = 24;
        this.f13880y = new int[2];
        setVisibility(8);
        this.f13870a = tnVar;
        setClipToPadding(false);
        setClipChildren(false);
        tnVar.f42973t0.j(new g2(this, 10));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new t(this, 1));
            return;
        }
        this.f13879x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new q1(this, 18));
        duration.addListener(new ag.m0(this, 12));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages y8;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f13872c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f13872c.get(0);
            if (messageObject.getGroupId() != 0 && (y8 = this.f13870a.y8(messageObject.getGroupId())) != null && (arrayList = y8.messages) != null) {
                int size = arrayList.size();
                while (i10 < size) {
                    MessageObject messageObject2 = arrayList.get(i10);
                    i10++;
                    MessageObject messageObject3 = messageObject2;
                    TLRPC.Message message = messageObject3.messageOwner;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                        return messageObject3;
                    }
                }
            }
            return messageObject;
        }
        return null;
    }

    public final void c(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: kg.v.c(boolean):void");
    }

    public final boolean d() {
        if (this.d && !this.f13878w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f13878w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r11) {
        throw new UnsupportedOperationException("Method not decompiled: kg.v.setSelectedMessages(java.util.List):void");
    }
}
