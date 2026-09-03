package nh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class g4 {
    public final int f15330a;
    public final ImageReceiver f15331b;
    public int f15332c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.z5 f15333f;
    public final org.telegram.ui.Components.z5 f15334g;
    public final org.telegram.ui.Components.z5 h;
    public float f15335i;
    public float f15336j;
    public float f15337k;
    public final boolean f15338l;
    public final RectF f15339m;
    public final RectF f15340n;

    public g4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f15331b = imageReceiver;
        this.f15332c = 0;
        this.d = false;
        this.e = 1.0f;
        mr mrVar = mr.h;
        this.f15333f = new org.telegram.ui.Components.z5(profileStoriesView, 420L, mrVar);
        this.f15334g = new org.telegram.ui.Components.z5(profileStoriesView, 420L, mrVar);
        this.h = new org.telegram.ui.Components.z5(profileStoriesView, 420L, mrVar);
        this.f15339m = new RectF();
        this.f15340n = new RectF();
        this.f15330a = storyItem.f19394id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f15338l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f32300x) {
            imageReceiver.onAttachedToWindow();
        }
        q20[] q20VarArr = m7.f15601a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            z8Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, z8Var);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.clearImage();
            }
        }
    }
}
