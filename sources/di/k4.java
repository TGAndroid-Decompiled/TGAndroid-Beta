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
import org.telegram.ui.Components.xq;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class k4 {
    public final int f9286a;
    public final ImageReceiver f9287b;
    public int f9288c;
    public boolean d;
    public float f9289e;
    public final org.telegram.ui.Components.w5 f9290f;
    public final org.telegram.ui.Components.w5 f9291g;
    public final org.telegram.ui.Components.w5 h;
    public float f9292i;
    public float f9293j;
    public float f9294k;
    public final boolean f9295l;
    public final RectF f9296m;
    public final RectF f9297n;

    public k4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f9287b = imageReceiver;
        this.f9288c = 0;
        this.d = false;
        this.f9289e = 1.0f;
        xq xqVar = xq.h;
        this.f9290f = new org.telegram.ui.Components.w5(profileStoriesView, 420L, xqVar);
        this.f9291g = new org.telegram.ui.Components.w5(profileStoriesView, 420L, xqVar);
        this.h = new org.telegram.ui.Components.w5(profileStoriesView, 420L, xqVar);
        this.f9296m = new RectF();
        this.f9297n = new RectF();
        this.f9286a = storyItem.f27192id;
        imageReceiver.J0(org.telegram.messenger.g0.L(200.0f));
        imageReceiver.H0(profileStoriesView);
        this.f9295l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f42003y) {
            imageReceiver.P();
        }
        e10[] e10VarArr = r7.f9704a;
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
