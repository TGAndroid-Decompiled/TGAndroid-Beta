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
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class l4 {
    public final int f9310a;
    public final ImageReceiver f9311b;
    public int f9312c;
    public boolean d;
    public float f9313e;
    public final org.telegram.ui.Components.w5 f9314f;
    public final org.telegram.ui.Components.w5 f9315g;
    public final org.telegram.ui.Components.w5 h;
    public float f9316i;
    public float f9317j;
    public float f9318k;
    public final boolean f9319l;
    public final RectF f9320m;
    public final RectF f9321n;

    public l4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f9311b = imageReceiver;
        this.f9312c = 0;
        this.d = false;
        this.f9313e = 1.0f;
        xq xqVar = xq.h;
        this.f9314f = new org.telegram.ui.Components.w5(profileStoriesView, 420L, xqVar);
        this.f9315g = new org.telegram.ui.Components.w5(profileStoriesView, 420L, xqVar);
        this.h = new org.telegram.ui.Components.w5(profileStoriesView, 420L, xqVar);
        this.f9320m = new RectF();
        this.f9321n = new RectF();
        this.f9310a = storyItem.f27195id;
        imageReceiver.J0(org.telegram.messenger.g0.L(200.0f));
        imageReceiver.H0(profileStoriesView);
        this.f9319l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f42014y) {
            imageReceiver.P();
        }
        f10[] f10VarArr = s7.f9735a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject e22 = qp.s1(imageReceiver.d).e2(storyItem.dialogId);
            w8Var.l(e22);
            imageReceiver.i0(e22, w8Var, null);
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
