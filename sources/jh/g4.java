package jh;

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
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Stories.ProfileStoriesView;

public final class g4 {

    public final int f13354a;

    public final ImageReceiver f13355b;

    public int f13356c;
    public boolean d;

    public float f13357e;

    public final org.telegram.ui.Components.y5 f13358f;

    public final org.telegram.ui.Components.y5 f13359g;
    public final org.telegram.ui.Components.y5 h;

    public float f13360i;

    public float f13361j;

    public float f13362k;

    public final boolean f13363l;

    public final RectF f13364m;

    public final RectF f13365n;

    public g4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f13355b = imageReceiver;
        this.f13356c = 0;
        this.d = false;
        this.f13357e = 1.0f;
        er erVar = er.h;
        this.f13358f = new org.telegram.ui.Components.y5(profileStoriesView, 420L, erVar);
        this.f13359g = new org.telegram.ui.Components.y5(profileStoriesView, 420L, erVar);
        this.h = new org.telegram.ui.Components.y5(profileStoriesView, 420L, erVar);
        this.f13364m = new RectF();
        this.f13365n = new RectF();
        this.f13354a = storyItem.f22617id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f13363l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f36223x) {
            imageReceiver.onAttachedToWindow();
        }
        c20[] c20VarArr = l7.f13626a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            y8Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, y8Var);
        } else {
            if (messageMedia != null && (document = messageMedia.document) != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
                return;
            }
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo == null || (arrayList = photo.sizes) == null) {
                imageReceiver.clearImage();
            } else {
                imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            }
        }
    }
}
