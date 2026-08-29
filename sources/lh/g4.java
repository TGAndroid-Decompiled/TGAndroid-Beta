package lh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class g4 {
    public final int f15620a;
    public final ImageReceiver f15621b;
    public int f15622c;
    public boolean d;
    public float f15623e;
    public final org.telegram.ui.Components.d6 f15624f;
    public final org.telegram.ui.Components.d6 f15625g;
    public final org.telegram.ui.Components.d6 h;
    public float f15626i;
    public float f15627j;
    public float f15628k;
    public final boolean f15629l;
    public final RectF f15630m;
    public final RectF f15631n;

    public g4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f15621b = imageReceiver;
        this.f15622c = 0;
        this.d = false;
        this.f15623e = 1.0f;
        jr jrVar = jr.h;
        this.f15624f = new org.telegram.ui.Components.d6(profileStoriesView, 420L, jrVar);
        this.f15625g = new org.telegram.ui.Components.d6(profileStoriesView, 420L, jrVar);
        this.h = new org.telegram.ui.Components.d6(profileStoriesView, 420L, jrVar);
        this.f15630m = new RectF();
        this.f15631n = new RectF();
        this.f15620a = storyItem.f22629id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f15629l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f36285x) {
            imageReceiver.onAttachedToWindow();
        }
        k20[] k20VarArr = l7.f15896a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            e9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, e9Var);
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
