package ih;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.z10;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class k4 {
    public final int f11671a;
    public final ImageReceiver f11672b;
    public int f11673c;
    public boolean d;
    public float f11674e;
    public final org.telegram.ui.Components.y5 f11675f;
    public final org.telegram.ui.Components.y5 f11676g;
    public final org.telegram.ui.Components.y5 h;
    public float f11677i;
    public float f11678j;
    public float f11679k;
    public final boolean f11680l;
    public final RectF f11681m;
    public final RectF f11682n;

    public k4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f11672b = imageReceiver;
        this.f11673c = 0;
        this.d = false;
        this.f11674e = 1.0f;
        gr grVar = gr.h;
        this.f11675f = new org.telegram.ui.Components.y5(profileStoriesView, 420L, grVar);
        this.f11676g = new org.telegram.ui.Components.y5(profileStoriesView, 420L, grVar);
        this.h = new org.telegram.ui.Components.y5(profileStoriesView, 420L, grVar);
        this.f11681m = new RectF();
        this.f11682n = new RectF();
        this.f11671a = storyItem.f22617id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f11680l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f36220x) {
            imageReceiver.onAttachedToWindow();
        }
        z10[] z10VarArr = p7.f11959a;
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
