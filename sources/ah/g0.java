package ah;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.co;
public final class g0 extends FrameLayout {
    public final co f535a;
    public f0 f536b;
    public List f537c;
    public boolean d;
    public MessageObject f538e;
    public final int f539f;
    public final int h;
    public float f540n;
    public float f541r;
    public float f542s;
    public long v;
    public boolean f543w;
    public boolean f544x;
    public final int[] f545y;

    public g0(co coVar, Context context) {
        super(context);
        this.f537c = Collections.EMPTY_LIST;
        this.f539f = 22;
        this.h = 24;
        this.f545y = new int[2];
        setVisibility(8);
        this.f535a = coVar;
        setClipToPadding(false);
        setClipChildren(false);
        coVar.f35473x0.j(new e0(this, 0));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new c0(this, 1));
            return;
        }
        this.f544x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new d0(this, 0));
        duration.addListener(new b(this, 1));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages y82;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f537c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f537c.get(0);
            if (messageObject.getGroupId() != 0 && (y82 = this.f535a.y8(messageObject.getGroupId())) != null && (arrayList = y82.messages) != null) {
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
        throw new UnsupportedOperationException("Method not decompiled: ah.g0.c(boolean):void");
    }

    public final boolean d() {
        if (this.d && !this.f543w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f543w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r11) {
        throw new UnsupportedOperationException("Method not decompiled: ah.g0.setSelectedMessages(java.util.List):void");
    }
}
