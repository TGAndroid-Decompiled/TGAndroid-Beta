package li;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.MessageObject;
public final class h extends AnimatorListenerAdapter {
    public final MessageObject.GroupedMessages.TransitionParams f16112a;

    public h(MessageObject.GroupedMessages.TransitionParams transitionParams) {
        this.f16112a = transitionParams;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        MessageObject.GroupedMessages.TransitionParams transitionParams = this.f16112a;
        transitionParams.backgroundChangeBounds = false;
        transitionParams.drawBackgroundForDeletedItems = false;
    }
}
