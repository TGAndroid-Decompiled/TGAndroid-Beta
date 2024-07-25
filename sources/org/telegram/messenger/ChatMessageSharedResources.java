package org.telegram.messenger;

import android.content.Context;
import android.graphics.drawable.Drawable;
public class ChatMessageSharedResources {
    public Drawable chat_msgAvatarLiveLocationDrawable;
    public Drawable chat_redLocationIcon;
    public Context context;

    public ChatMessageSharedResources(Context context) {
        this.context = context;
    }

    public Drawable getRedLocationIcon() {
        if (this.chat_redLocationIcon == null) {
            this.chat_redLocationIcon = this.context.getResources().getDrawable(R.drawable.map_pin).mutate();
        }
        return this.chat_redLocationIcon;
    }

    public Drawable getAvatarLiveLocation() {
        if (this.chat_msgAvatarLiveLocationDrawable == null) {
            this.chat_msgAvatarLiveLocationDrawable = this.context.getResources().getDrawable(R.drawable.livepin).mutate();
        }
        return this.chat_msgAvatarLiveLocationDrawable;
    }
}
