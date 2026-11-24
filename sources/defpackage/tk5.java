package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;
import org.telegram.ui.ActionBar.d;
public interface tk5 {
    d getBackgroundFragment();

    my0 getBottomSheet();

    List getFragmentStack();

    d getLastFragment();

    m37 getMessageDrawableOutMediaStart();

    m37 getMessageDrawableOutStart();

    FrameLayout getOverlayContainerView();

    Activity getParentActivity();

    List getPulledDialogs();

    d getSafeLastFragment();

    float getThemeAnimationValue();

    ViewGroup getView();

    Window getWindow();

    void setBackgroundView(View view);

    void setDelegate(pk5 pk5Var);

    void setDrawerLayoutContainer(wr3 wr3Var);

    void setFragmentPanTranslationOffset(int i);

    void setFragmentStack(List list);

    void setHighlightActionButtons(boolean z);

    void setInBubbleMode(boolean z);

    void setIsSheet(boolean z);

    void setNavigationBarColor(int i);

    void setPulledDialogs(List list);

    void setRemoveActionBarExtraHeight(boolean z);

    void setUseAlphaAnimations(boolean z);

    void setWindow(Window window);
}
