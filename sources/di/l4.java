package di;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class l4 {
    public final int f9315a;
    public final ImageReceiver f9316b;
    public int f9317c;
    public boolean d;
    public float f9318e;
    public final org.telegram.ui.Components.v5 f9319f;
    public final org.telegram.ui.Components.v5 f9320g;
    public final org.telegram.ui.Components.v5 h;
    public float f9321i;
    public float f9322j;
    public float f9323k;
    public final boolean f9324l;
    public final RectF f9325m;
    public final RectF f9326n;

    public l4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f9316b = imageReceiver;
        this.f9317c = 0;
        this.d = false;
        this.f9318e = 1.0f;
        wq wqVar = wq.h;
        this.f9319f = new org.telegram.ui.Components.v5(profileStoriesView, 420L, wqVar);
        this.f9320g = new org.telegram.ui.Components.v5(profileStoriesView, 420L, wqVar);
        this.h = new org.telegram.ui.Components.v5(profileStoriesView, 420L, wqVar);
        this.f9325m = new RectF();
        this.f9326n = new RectF();
        this.f9315a = storyItem.f27199id;
        imageReceiver.J0(org.telegram.messenger.g0.L(200.0f));
        imageReceiver.H0(profileStoriesView);
        this.f9324l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f42005y) {
            imageReceiver.P();
        }
        e10[] e10VarArr = s7.f9740a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject e22 = qp.s1(imageReceiver.d).e2(storyItem.dialogId);
            v8Var.l(e22);
            imageReceiver.i0(e22, v8Var, null);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.r0(hc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, gc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.u0(null, null, hc.i(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, gc.m(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.f();
            }
        }
    }
}
